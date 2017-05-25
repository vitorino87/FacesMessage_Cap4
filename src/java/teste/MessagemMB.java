/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author tiago.lucas
 */
@ManagedBean
@RequestScoped
public class MessagemMB {

    /**
     * Creates a new instance of MessagemMB
     */
    public MessagemMB() {
    }
    public void criarMensagem(){
        FacesMessage mensagem = new FacesMessage("Aluno Removido", "O aluno foi"
                + " removido com sucesso");
        mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
        FacesContext.getCurrentInstance().addMessage(null, mensagem);
    }
}
