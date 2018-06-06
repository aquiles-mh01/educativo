package pe.royalsystems.springerp.controller;

import javax.faces.bean.ManagedBean;
        import javax.faces.bean.RequestScoped;
/**
 * Created by marcus on 28/06/2015.
 */
@ManagedBean(name = "index")
@RequestScoped
public class IndexView {
    private String message;

    public IndexView(){
        message = "Hello";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
