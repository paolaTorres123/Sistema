package mx.uaz.edu.SistemaBecasCASE.vistas;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.declarative.Design;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.ComboBox;

/**
 * !! DO NOT EDIT THIS FILE !!
 * <p>
 * This class is generated by Vaadin Designer and will be overwritten.
 * <p>
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class FormUsuarioDesign extends CssLayout {
    protected TextField nombreUsuario;
    protected PasswordField contrasena;
    protected PasswordField contrasenaConf;
    protected ComboBox<mx.uaz.edu.SistemaBecasCASE.modelos.TipoUsuario> cbTipoUsuario;
    protected TextField email;
    protected Button btnRegistrar;
    protected Button btnCancelar;

    public FormUsuarioDesign() {
        Design.read(this);
    }
}
