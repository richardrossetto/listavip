package br.com.listavip.controller;

import br.com.enviadoremail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import br.com.listavip.model.Convidado;
import br.com.listavip.service.ConvidadoService;

/**
 * Created by richard on 24/11/17.
 */
@Controller
public class ConvidadoController {

    @Autowired
    private ConvidadoService convidadoService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/listaConvidados")
    public String listaDeConvidados(Model model){
        Iterable<Convidado> convidados = convidadoService.obterTodos();
        model.addAttribute("convidados", convidados);
        return "listaConvidados";
    }

    @RequestMapping(value= "salvar", method = RequestMethod.POST)
    public String salva(@RequestParam("nome") String nome, @RequestParam("email") String email,
                         @RequestParam("telefone") String telefone, Model model ){

        Convidado novoConvidado = new Convidado(nome, email, telefone);
        convidadoService.salvar(novoConvidado);

        new EmailService().enviar(nome, email);

        Iterable<Convidado> convidados = convidadoService.obterTodos();
        model.addAttribute("convidados", convidados);

        return "redirect:listaConvidados";
    }

/*
    public void obterConvidadoPorNome(String name){
        convidadoService.findByName(name);
    }
*/
}
