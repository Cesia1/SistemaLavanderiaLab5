/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

/**
 *
 * @author Cesia
 */
public class frmPresentacion extends javax.swing.JFrame {

    String Texto = "";
    String Puesto;
    String user;
        //region AtributosCliente
//        CapaPresentacion.MantenimientoCliente.frmNuevoCliente ofrmNuevoCliente = new CapaPresentacion.MantenimientoCliente.frmNuevoCliente();
//        CapaPresentacion.MantenimientoCliente.frmMostrarClientes ofrmMostarCliente = new CapaPresentacion.MantenimientoCliente.frmMostrarClientes();
//        CapaPresentacion.MantenimientoCliente.frmModificarCliente ofrmModificarCliente = new CapaPresentacion.MantenimientoCliente.frmModificarCliente();
//        CapaPresentacion.MantenimientoCliente.frmCliente ofrmCliente = new CapaPresentacion.MantenimientoCliente.frmCliente();
        //endregion
        //region AtributosUsuario
//        CapaPresentacion.MantenimientoUsuario.frmNuevoUsuario ofrmNuevoUsuario = new CapaPresentacion.MantenimientoUsuario.frmNuevoUsuario();
//        CapaPresentacion.MantenimientoUsuario.frmMostrarUsuario ofrmMostarUsuario = new CapaPresentacion.MantenimientoUsuario.frmMostrarUsuario();
//        CapaPresentacion.MantenimientoUsuario.frmModificarUsuario ofrmModificarUsuario = new CapaPresentacion.MantenimientoUsuario.frmModificarUsuario();
//        //CapaPresentacion.MantenimientoUsuario.frmDesabilitarUsuario ofrmDesabilitarUsuario = new CapaPresentacion.MantenimientoUsuario.frmDesabilitarUsuario();
//        CapaPresentacion.MantenimientoUsuario.frmUsuario ofrmUsuario = new CapaPresentacion.MantenimientoUsuario.frmUsuario();
        //endregion
        //region AtributosEmpresa
//        CapaPresentacion.MantenimientoClienteJuridico.frmNuevoClienteJuridico ofrmNuevoEmpresa = new CapaPresentacion.MantenimientoClienteJuridico.frmNuevoClienteJuridico();
//        CapaPresentacion.MantenimientoClienteJuridico.frmMostrarClientesJuridico ofrmMostarEmpresa = new CapaPresentacion.MantenimientoClienteJuridico.frmMostrarClientesJuridico();
//        CapaPresentacion.MantenimientoClienteJuridico.frmModificarClienteJuridico ofrmModificarEmpresa = new CapaPresentacion.MantenimientoClienteJuridico.frmModificarClienteJuridico();
//        CapaPresentacion.MantenimientoClienteJuridico.frmClienteJuridico ofrmEmpresa = new CapaPresentacion.MantenimientoClienteJuridico.frmClienteJuridico();
//        //endregion
        //region AtributosPrenda
//        CapaPresentacion.MantenimientoPrendas.frmNuevaPrenda ofrmNuevoPrenda = new CapaPresentacion.MantenimientoPrendas.frmNuevaPrenda();
//        CapaPresentacion.MantenimientoPrendas.frmMostrarPrendas ofrmMostrarPrendas = new CapaPresentacion.MantenimientoPrendas.frmMostrarPrendas();
//        CapaPresentacion.MantenimientoPrendas.frmModificarPrendas ofrmModificarPrendas = new CapaPresentacion.MantenimientoPrendas.frmModificarPrendas();
//        CapaPresentacion.MantenimientoPrendas.frmPrendas ofrmPrendas = new CapaPresentacion.MantenimientoPrendas.frmPrendas();
//        //endregion
        //region AtributosProducto
//        CapaPresentacion.MantenimientoProductos.frmNuevoProducto ofrmNuevoProducto = new CapaPresentacion.MantenimientoProductos.frmNuevoProducto();
//        CapaPresentacion.MantenimientoProductos.frmMostrarProductos ofrmMostrarProductos = new CapaPresentacion.MantenimientoProductos.frmMostrarProductos();
//        CapaPresentacion.MantenimientoProductos.frmModificarProductos ofrmModificarProductos = new CapaPresentacion.MantenimientoProductos.frmModificarProductos();
//        CapaPresentacion.MantenimientoProductos.frmProducto ofrmProducto = new CapaPresentacion.MantenimientoProductos.frmProducto();
//        //endregion
        //region AtributosSeguridad
//        Seguridad.frmCambiarContrasenia ofrmCambiarContrasenia;
//        Seguridad.frmSeguridadInicio ofrmSeguridadInicio = new Seguridad.frmSeguridadInicio();
//        Seguridad.frmSacarBackup ofrmSacarBackup = new Seguridad.frmSacarBackup();
//        //endregion 
//        //region AtributosDeshabilitar
//        CapaPresentacion.MantenimientoCliente.frmDeshabilitarCliente ofrmDeshabilitarCliente = new CapaPresentacion.MantenimientoCliente.frmDeshabilitarCliente();
//        CapaPresentacion.MantenimientoClienteJuridico.frmDeshabilitarClienteJuridico ofrmDeshabilitarClienteJuridico = new CapaPresentacion.MantenimientoClienteJuridico.frmDeshabilitarClienteJuridico();
//        CapaPresentacion.MantenimientoPrendas.frmDeshabilitarPrenda ofrmDeshabilitarPrenda = new CapaPresentacion.MantenimientoPrendas.frmDeshabilitarPrenda();
//        CapaPresentacion.MantenimientoProductos.frmDeshabilitarProducto ofrmDeshabilitarProducto = new CapaPresentacion.MantenimientoProductos.frmDeshabilitarProducto();
//        CapaPresentacion.MantenimientoUsuario.frmDeshabilitarUsuario ofrmDeshabilitarUsuario = new CapaPresentacion.MantenimientoUsuario.frmDeshabilitarUsuario();
//        Seguridad.frmDeshabilitarInicio ofrmDeshabilitarInicio = new Seguridad.frmDeshabilitarInicio();
//        //endregion
//        //region AtributosComprobante
//        CapaPresentacion.Proceso.frmComprobante ofrmComprobante = new CapaPresentacion.Proceso.frmComprobante();
//        CapaPresentacion.Proceso.frmComprobanteCompra ofrmComprobanteCompra;
//        CapaPresentacion.Proceso.frmComprobanteEntrada ofrmComprobanteEntrada;
//        CapaPresentacion.CapaPresentacion.MantenimientoBoleta.frmListarBoleta ofrmListarBoleta = new CapaPresentacion.MantenimientoBoleta.frmListarBoleta();
//        CapaPresentacion.CapaPresentacion.MantenimientoFactura.frmListarFactura ofrmListarFactura = new CapaPresentacion.MantenimientoFactura.frmListarFactura();
//        //endregion
//        //region AtributosReportes
//        Reportes.frmReportes ofrmReportes = new Reportes.frmReportes();
//        Reportes.frmReporteProducto ofrmReporteProducto = new Reportes.frmReporteProducto();
//        Reportes.frmReportePrenda ofrmReportePrenda = new Reportes.frmReportePrenda();
//        Reportes.frmReporteCliente ofrmReporteCliente = new Reportes.frmReporteCliente();
//        Reportes.frmReporteClienteJuridico ofrmReporteClienteJuridico = new Reportes.frmReporteClienteJuridico();       
//        Reportes.frmReporteUsuario ofrmReporteUsuario = new Reportes.frmReporteUsuario();
//        Reportes.frmReporteBoleta ofrmReporteBoleta = new Reportes.frmReporteBoleta();
//        Reportes.frmReporteFactura ofrmReporteFactura = new Reportes.frmReporteFactura();
//        Reportes.frmReporteCompra ofrmReporteCompra = new Reportes.frmReporteCompra();
//        Reportes.frmReporteEntradaSalida ofrmReporteCaja = new Reportes.frmReporteEntradaSalida();
//      
//        //fmInicio ofmInicio;
    
//        public frmPresentacion(String Cargo,String Usuario)
//        {
//            initComponents();
//            //InitializeComponent();
//            user = Usuario;
//            estadomuestra1.Caption = "Usuario: "+Usuario;
//            estadomuestra2.Caption = "Maquina: "+Environment.MachineName;
//            estadomuestra3.Caption = "Hora: "+DateTime.Now.ToLongTimeString();
//            estadomuestra4.Caption = "Día: "+DateTime.Now.ToLongDateString();
//            Puesto = Cargo;
//            ofmInicio = new fmInicio(Cargo);
//            inicializarrb();
//            this.IsMdiContainer = true;
//            ofmInicio.MdiParent = this;
//            ofmInicio.Opener = this;
//            ofmInicio.Show();
//            ofrmCambiarContrasenia = new Seguridad.frmCambiarContrasenia(user);
//            ofrmComprobanteCompra = new Proceso.frmComprobanteCompra(user);
//            ofrmComprobanteEntrada = new Proceso.frmComprobanteEntrada(user);
//       }
//        public void cambiarTexto(String text)
//        {
//            Texto = text;
//            Abrir();
//        }
        private void inicializarrb()
        {
//            rbCliente.Visible = false;
//            rbUsuario.Visible = false;
//            rbSeguridad.Visible = false;
//            rbEmpresa.Visible = false;
//            rbPrenda.Visible = false;
//            rbProducto.Visible = false;
//            rbDeshabilitar.Visible = false;
//            rbComprobantes.Visible = false;
//            rbReportes.Visible = false;
        }
        private void Abrir()
        {
            switch (Texto)
            {
                case "CLIENTE": Cliente();
                    break;
                //case "USUARIO": Usuario();
                 //   break;
                //case "CAMBIARCONTRASENIA": SeguridadM();
                 //   break;
                //case "CLIENTEJURIDICO": Empresa();
                  //  break;
//                case "PRENDAS": Prenda();
//                    break;
//                case "PRODUCTO": Producto();
//                    break;
//                case "DESHABILITAR": Deshabilitar();
//                    break;
//                case "COMPROBANTE": Comprobante();
//                    break;
//                case "REPORTES": Reporte();
//                    break;
//                default:   break;
            }
        }
        //region Cliente
        
        //region ConfiguracionInicialCliente
        public void Cliente()
        {
//            rbModificarEmpresa.Minimized = false;
//            rbCliente.Visible = true;
//            ofmInicio.Visible = false;
//            ofrmNuevoCliente.MdiParent = this;
//            ofrmCliente.MdiParent = this;
//            ofrmMostarCliente.MdiParent = this;
//            ofrmModificarCliente.MdiParent = this;
//            //ofrmEliminarCliente.MdiParent = this;
//            try
//            {
//                ofrmCliente.Show();
//            }
//            catch
//            {
//                ofrmCliente.Visible = true;
//            }
//            InitSkinGallery();
//            ConfigurarInicialCliente();
//        }
//        public void ConfigurarInicialCliente()
//        {
//            btnInicioCliente.setEnabled( = true;
//            btnClienteSalir.setEnabled( = true;
//            btnClienteNuevo.setEnabled( = true;
//            btnClienteGuardar.setEnabled( = false;
//            btnClienteCancelar.setEnabled( = false;
//            btnClienteMostrar.setEnabled( = true;
//            btnClienteActualizar.setEnabled( = true;
//            btnClienteModificar.setEnabled( = true;
//            btnClienteModificarListo.setEnabled( = false;
//            btnClienteCancelarModificar.setEnabled( = false;
//            btnClienteEliminar.setEnabled( = true;
//            btnClienteEliminarListo.setEnabled( = false;
//            btnCancelarEliminarCliente.setEnabled( = false;
//        }
//        
//        void InitSkinGallery()
//        {
//            DevExpress.XtraBars.Helpers.SkinHelper.InitSkinGallery(rgvClientesEstilo, true);
//        }
//        
        //region InsertarCliente
//        private void btnClienteNuevo_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = false;
//            try
//            {
//                ofrmNuevoCliente.Show();
//            }
//            catch
//            { 
//                ofrmNuevoCliente.Visible=true;
//            }
//            ConfigurarInsertarCliente();
//        }
//        public void ConfigurarInsertarCliente()
//        {
//            btnInicioCliente.setEnabled( = false;
//            btnClienteSalir.setEnabled( = false;
//            btnClienteNuevo.setEnabled( = false;
//            btnClienteGuardar.setEnabled( = true;
//            btnClienteCancelar.setEnabled( = true;
//            btnClienteMostrar.setEnabled( = false;
//            btnClienteActualizar.setEnabled( = false;
//            btnClienteModificar.setEnabled( = false;
//            btnClienteModificarListo.setEnabled( = false;
//            btnClienteCancelarModificar.setEnabled( = false;
//            btnClienteEliminar.setEnabled( = false;
//            btnClienteEliminarListo.setEnabled( = false;
//            btnCancelarEliminarCliente.setEnabled( = false;
//        }
//        private void btnClienteGuardar_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmNuevoCliente.Insertar();
//            ofrmNuevoCliente.Visible = false;
//            ConfigurarInicialCliente();
//        } 
//        private void btnClienteCancelar_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmNuevoCliente.Cancelar();
//            ofrmNuevoCliente.Visible = false;
//            ConfigurarInicialCliente();
//        }
//        //endregion
//        //region MostrarCliente
//        private void btnClienteMostrar_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = false;
//            try
//            { ofrmMostarCliente.Show();}
//            catch
//            { ofrmMostarCliente.Visible=true;}          
//        }
//        private void btnClienteActualizar_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmMostarCliente.Actualizar();
//        }
//        //endregion    
//        //region ModificarCliente
//        private void btnClienteModificar_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = false;
//            try
//            {
//                ofrmModificarCliente.Show();
//            }
//            catch
//            {
//                ofrmModificarCliente.Visible = true;
//            }
//            ConfigurarModificarCliente();
//        }
//        public void ConfigurarModificarCliente()
//        {
//            btnClienteInicio.setEnabled(false);
//            btnClienteSalir.setEnabled(false);
//            btnClienteNuevo.setEnabled(false);
//            btnClienteGuardar.setEnabled(false);
//            btnClienteCancelar.setEnabled(false);
//            btnClienteListar.setEnabled(false);
//            btnClienteActualizar.setEnabled(false);
//            btnClienteModificar.setEnabled(false);
//            btnClienteModificarListo.setEnabled(true);
//            btnClienteCancelarModificar.setEnabled(true);
//            btnClienteEliminar.setEnabled(false);
//            btnClienteEliminarListo.setEnabled( = false;
//            btnCancelarEliminarCliente.setEnabled( = false;
//        }
//        private void btnClienteModificarListo_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmModificarCliente.Modificar();
//            ofrmModificarCliente.Visible = false;
//            ConfigurarInicialCliente();
//        }
//        private void btnClienteCancelarModificar_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmModificarCliente.configurarNuevo();
//            ofrmModificarCliente.Visible = false;
//            ConfigurarInicialCliente();
//        }
//        //endregion        
//        //region Configuracion
//        private void btnInicioCliente_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = true;
//            ofmInicio.Visible = true;
//        }
       
        //endregion  
        //endregion
        //region Usuario
        //region Configuracion Inicial
        
//        public void Usuario()
//        {
//            rbModificarEmpresa.Minimized = false;
//            rbUsuario.Visible = true;
//            ofmInicio.Visible = false;
//            ofrmNuevoUsuario.MdiParent = this;
//            ofrmUsuario.MdiParent = this;
//            ofrmMostarUsuario.MdiParent = this;
//            ofrmModificarUsuario.MdiParent = this;
//            try
//            {
//                ofrmUsuario.Show();
//            }
//            catch
//            {
//                ofrmUsuario.Visible = true;
//            }
//            InitSkinGallery1();
//            ConfigurarInicialUsuario();
//
//        }
//        public void ConfigurarInicialUsuario()
//        {
//            btnInicioUsuario.setEnabled( = true;
//            btnUsuarioSalir.setEnabled( = true;
//            btnNuevoUsuario.setEnabled( = true;
//            btnGuardarUsuario.setEnabled( = false;
//            btnCancelarNuevoUsuario.setEnabled( = false;
//            btnMostrarUsuario.setEnabled( = true;
//            btnActualizarUsuario.setEnabled( = true;
//            btnModificarUsuario.setEnabled( = true;
//            btnModificarListoUsuario.setEnabled( = false;
//            btnCancelarModificarUsuario.setEnabled( = false;
//            btnDeshabilitarUsuario.setEnabled( = true;
//            btnDeshabilitarUsuarioListo.setEnabled( = false;
//            btnCancelarEliminación.setEnabled( = false;
//
//        }
//        void InitSkinGallery1()
//        {
//            DevExpress.XtraBars.Helpers.SkinHelper.InitSkinGallery(dgvUsaurio, true);
//        }
//        //endregion
//        //region InsertarUsuario
//        private void btnNuevoUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = false;
//            try
//            {
//                ofrmNuevoUsuario.Show();
//            }
//            catch
//            {
//                ofrmNuevoUsuario.Visible = true;
//            }
//            ConfigurarInsertarUsuario();
//        }
//        public void ConfigurarInsertarUsuario()
//        {
//            btnInicioUsuario.setEnabled( = false;
//            btnUsuarioSalir.setEnabled( = false;
//            btnNuevoUsuario.setEnabled( = false;
//            btnGuardarUsuario.setEnabled( = true;
//            btnCancelarNuevoUsuario.setEnabled( = true;
//            btnMostrarUsuario.setEnabled( = false;
//            btnActualizarUsuario.setEnabled( = false;
//            btnModificarUsuario.setEnabled( = false;
//            btnModificarListoUsuario.setEnabled( = false;
//            btnCancelarModificarUsuario.setEnabled( = false;
//            btnDeshabilitarUsuario.setEnabled( = false;
//            btnDeshabilitarUsuarioListo.setEnabled( = false;
//            btnCancelarEliminación.setEnabled( = false;
//        } 
//        private void btnGuardarUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmNuevoUsuario.Insertar();
//            ofrmNuevoUsuario.Visible = false;
//            ConfigurarInicialUsuario();
//        }
//        private void btnCancelarNuevoUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmNuevoUsuario.Cancelar();
//            ofrmNuevoUsuario.Visible = false;
//            ConfigurarInicialUsuario();
//
//        }
//        //endregion
//        //region MostrarUsuario
//        private void btnMostrarUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = false;
//            try
//            { ofrmMostarUsuario.Show(); }
//            catch
//            { ofrmMostarUsuario.Visible = true; }   
//        }
//        private void btnActualizarUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmMostarUsuario.Actualizar();
//        }
//        //endregion
//        //region Configuracion
//        private void btnInicioUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = true;
//            ofmInicio.Visible = true;
//        }
//        private void btnUsuarioSalir_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbUsuario.Visible = false;
//            ofmInicio.Visible = true;
//            ofrmMostarUsuario.Visible = false;
//            ofrmNuevoUsuario.Visible = false;
//            ofrmModificarUsuario.Visible = false;
//            ofrmUsuario.Visible = false; 
//
//        }
//        //endregion
//        //region ModificarUsuario
//        private void btnModificarUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = false;
//            try
//            {
//                ofrmModificarUsuario.Show();
//            }
//            catch
//            {
//                ofrmModificarUsuario.Visible = true;
//            }
//            ConfigurarModificarUsuario();
//
//        }
//        public void ConfigurarModificarUsuario()
//        {
//            btnInicioUsuario.setEnabled( = false;
//            btnUsuarioSalir.setEnabled( = false;
//            btnNuevoUsuario.setEnabled( = false;
//            btnGuardarUsuario.setEnabled( = false;
//            btnCancelarNuevoUsuario.setEnabled( = false;
//            btnMostrarUsuario.setEnabled( = false;
//            btnActualizarUsuario.setEnabled( = false;
//            btnModificarUsuario.setEnabled( = false;
//            btnModificarListoUsuario.setEnabled( = true;
//            btnCancelarModificarUsuario.setEnabled( = true;
//            btnDeshabilitarUsuario.setEnabled( = false;
//            btnDeshabilitarUsuarioListo.setEnabled( = false;
//            btnCancelarEliminación.setEnabled( = false;
//
//        }
//        private void btnModificarListoUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmModificarUsuario.Modificar();
//            ofrmModificarUsuario.Visible = false;
//            ConfigurarInicialUsuario();
//
//        }
//        private void btnCancelarModificarUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmModificarUsuario.configurarNuevo();
//            ofrmModificarUsuario.Visible = false;
//            ConfigurarInicialUsuario();
//
//        }
//        //endregion
//        //endregion
//                
//                
//                //region Cliente
//        //region ConfiguracionInicialCliente
//        public void Cliente()
//        {
//            rbModificarEmpresa.Minimized = false;
//            rbCliente.Visible = true;
//            ofmInicio.Visible = false;
//            ofrmNuevoCliente.MdiParent = this;
//            ofrmCliente.MdiParent = this;
//            ofrmMostarCliente.MdiParent = this;
//            ofrmModificarCliente.MdiParent = this;
//            //ofrmEliminarCliente.MdiParent = this;
//            try
//            {
//                ofrmCliente.Show();
//            }
//            catch
//            {
//                ofrmCliente.Visible = true;
//            }
//            InitSkinGallery();
//            ConfigurarInicialCliente();
//        }
//        public void ConfigurarInicialCliente()
//        {
//            btnClienteInicio.setEnabled( true);
//            btnClienteSalir.setEnabled( true);
//            btnClienteNuevo.setEnabled( true);
//            btnClienteGuardar.setEnabled( false);
//            btnClienteCancelar.setEnabled( false);
//            btnClienteListar.setEnabled( true);
//            btnClienteActualizar.setEnabled( true);
//            btnClienteModificar.setEnabled( true);
//            btnClienteModificarListo.setEnabled( false);
//            btnClienteCancelarModificar.setEnabled(false);
//            btnClienteEliminar.setEnabled(true);
//            btnClienteEliminarListo.setEnabled(false);
//            btnCancelarEliminarCliente.setEnabled(false);
//        }
//        void InitSkinGallery()
//        {
//            DevExpress.XtraBars.Helpers.SkinHelper.InitSkinGallery(rgvClientesEstilo, true);
//        }
//        //endregion
//        //region InsertarCliente
//        private void btnClienteNuevo_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = false;
//            try
//            {
//                ofrmNuevoCliente.Show();
//            }
//            catch
//            { 
//                ofrmNuevoCliente.Visible=true;
//            }
//            ConfigurarInsertarCliente();
//        }
//        public void ConfigurarInsertarCliente()
//        {
//            btnInicioCliente.setEnabled( = false;
//            btnClienteSalir.setEnabled( = false;
//            btnClienteNuevo.setEnabled( = false;
//            btnClienteGuardar.setEnabled( = true;
//            btnClienteCancelar.setEnabled( = true;
//            btnClienteMostrar.setEnabled( = false;
//            btnClienteActualizar.setEnabled( = false;
//            btnClienteModificar.setEnabled( = false;
//            btnClienteModificarListo.setEnabled( = false;
//            btnClienteCancelarModificar.setEnabled( = false;
//            btnClienteEliminar.setEnabled( = false;
//            btnClienteEliminarListo.setEnabled( = false;
//            btnCancelarEliminarCliente.setEnabled( = false;
//        }
//        private void btnClienteGuardar_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmNuevoCliente.Insertar();
//            ofrmNuevoCliente.Visible = false;
//            ConfigurarInicialCliente();
//        } 
//        private void btnClienteCancelar_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmNuevoCliente.Cancelar();
//            ofrmNuevoCliente.Visible = false;
//            ConfigurarInicialCliente();
//        }
//        //endregion
//        //region MostrarCliente
//        private void btnClienteMostrar_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = false;
//            try
//            { ofrmMostarCliente.Show();}
//            catch
//            { ofrmMostarCliente.Visible=true;}          
//        }
//        private void btnClienteActualizar_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmMostarCliente.Actualizar();
//        }
//        //endregion    
//        //region ModificarCliente
//        private void btnClienteModificar_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = false;
//            try
//            {
//                ofrmModificarCliente.Show();
//            }
//            catch
//            {
//                ofrmModificarCliente.Visible = true;
//            }
//            ConfigurarModificarCliente();
//        }
//        public void ConfigurarModificarCliente()
//        {
//            btnInicioCliente.setEnabled( = false;
//            btnClienteSalir.setEnabled( = false;
//            btnClienteNuevo.setEnabled( = false;
//            btnClienteGuardar.setEnabled( = false;
//            btnClienteCancelar.setEnabled( = false;
//            btnClienteMostrar.setEnabled( = false;
//            btnClienteActualizar.setEnabled( = false;
//            btnClienteModificar.setEnabled( = false;
//            btnClienteModificarListo.setEnabled( = true;
//            btnClienteCancelarModificar.setEnabled( = true;
//            btnClienteEliminar.setEnabled( = false;
//            btnClienteEliminarListo.setEnabled( = false;
//            btnCancelarEliminarCliente.setEnabled( = false;
//        }
//        private void btnClienteModificarListo_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmModificarCliente.Modificar();
//            ofrmModificarCliente.Visible = false;
//            ConfigurarInicialCliente();
//        }
//        private void btnClienteCancelarModificar_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmModificarCliente.configurarNuevo();
//            ofrmModificarCliente.Visible = false;
//            ConfigurarInicialCliente();
//        }
//        //endregion        
//        //region Configuracion
//        private void btnInicioCliente_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = true;
//            ofmInicio.Visible = true;
//        }
//        private void btnClienteSalir_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbCliente.Visible = false;
//            ofmInicio.Visible = true;
//            ofrmMostarCliente.Visible = false;
//            ofrmNuevoCliente.Visible = false;
//            ofrmModificarCliente.Visible = false;
//            //ofrmEliminarCliente.Visible=false;
//            ofrmCliente.Visible = false;
//        }
//        //endregion  
//        //endregion
//        //region Usuario
//        //region Configuracion Inicial
//        public void Usuario()
//        {
//            rbModificarEmpresa.Minimized = false;
//            rbUsuario.Visible = true;
//            ofmInicio.Visible = false;
//            ofrmNuevoUsuario.MdiParent = this;
//            ofrmUsuario.MdiParent = this;
//            ofrmMostarUsuario.MdiParent = this;
//            ofrmModificarUsuario.MdiParent = this;
//            try
//            {
//                ofrmUsuario.Show();
//            }
//            catch
//            {
//                ofrmUsuario.Visible = true;
//            }
//            InitSkinGallery1();
//            ConfigurarInicialUsuario();
//
//        }
//        public void ConfigurarInicialUsuario()
//        {
//            btnInicioUsuario.setEnabled( = true;
//            btnUsuarioSalir.setEnabled( = true;
//            btnNuevoUsuario.setEnabled( = true;
//            btnGuardarUsuario.setEnabled( = false;
//            btnCancelarNuevoUsuario.setEnabled( = false;
//            btnMostrarUsuario.setEnabled( = true;
//            btnActualizarUsuario.setEnabled( = true;
//            btnModificarUsuario.setEnabled( = true;
//            btnModificarListoUsuario.setEnabled( = false;
//            btnCancelarModificarUsuario.setEnabled( = false;
//            btnDeshabilitarUsuario.setEnabled( = true;
//            btnDeshabilitarUsuarioListo.setEnabled( = false;
//            btnCancelarEliminación.setEnabled( = false;
//
//        }
//        void InitSkinGallery1()
//        {
//            DevExpress.XtraBars.Helpers.SkinHelper.InitSkinGallery(dgvUsaurio, true);
//        }
//        //endregion
//        //region InsertarUsuario
//        private void btnNuevoUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = false;
//            try
//            {
//                ofrmNuevoUsuario.Show();
//            }
//            catch
//            {
//                ofrmNuevoUsuario.Visible = true;
//            }
//            ConfigurarInsertarUsuario();
//        }
//        public void ConfigurarInsertarUsuario()
//        {
//            btnInicioUsuario.setEnabled( = false;
//            btnUsuarioSalir.setEnabled( = false;
//            btnNuevoUsuario.setEnabled( = false;
//            btnGuardarUsuario.setEnabled( = true;
//            btnCancelarNuevoUsuario.setEnabled( = true;
//            btnMostrarUsuario.setEnabled( = false;
//            btnActualizarUsuario.setEnabled( = false;
//            btnModificarUsuario.setEnabled( = false;
//            btnModificarListoUsuario.setEnabled( = false;
//            btnCancelarModificarUsuario.setEnabled( = false;
//            btnDeshabilitarUsuario.setEnabled( = false;
//            btnDeshabilitarUsuarioListo.setEnabled( = false;
//            btnCancelarEliminación.setEnabled( = false;
//        } 
//        private void btnGuardarUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmNuevoUsuario.Insertar();
//            ofrmNuevoUsuario.Visible = false;
//            ConfigurarInicialUsuario();
//        }
//        private void btnCancelarNuevoUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmNuevoUsuario.Cancelar();
//            ofrmNuevoUsuario.Visible = false;
//            ConfigurarInicialUsuario();
//
//        }
//        //endregion
//        //region MostrarUsuario
//        private void btnMostrarUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = false;
//            try
//            { ofrmMostarUsuario.Show(); }
//            catch
//            { ofrmMostarUsuario.Visible = true; }   
//        }
//        private void btnActualizarUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmMostarUsuario.Actualizar();
//        }
//        //endregion
//        //region Configuracion
//        private void btnInicioUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = true;
//            ofmInicio.Visible = true;
//        }
//        private void btnUsuarioSalir_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbUsuario.Visible = false;
//            ofmInicio.Visible = true;
//            ofrmMostarUsuario.Visible = false;
//            ofrmNuevoUsuario.Visible = false;
//            ofrmModificarUsuario.Visible = false;
//            ofrmUsuario.Visible = false; 
//
//        }
//        //endregion
//        //region ModificarUsuario
//        private void btnModificarUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = false;
//            try
//            {
//                ofrmModificarUsuario.Show();
//            }
//            catch
//            {
//                ofrmModificarUsuario.Visible = true;
//            }
//            ConfigurarModificarUsuario();
//
//        }
//        public void ConfigurarModificarUsuario()
//        {
//            btnInicioUsuario.setEnabled( = false;
//            btnUsuarioSalir.setEnabled( = false;
//            btnNuevoUsuario.setEnabled( = false;
//            btnGuardarUsuario.setEnabled( = false;
//            btnCancelarNuevoUsuario.setEnabled( = false;
//            btnMostrarUsuario.setEnabled( = false;
//            btnActualizarUsuario.setEnabled( = false;
//            btnModificarUsuario.setEnabled( = false;
//            btnModificarListoUsuario.setEnabled( = true;
//            btnCancelarModificarUsuario.setEnabled( = true;
//            btnDeshabilitarUsuario.setEnabled( = false;
//            btnDeshabilitarUsuarioListo.setEnabled( = false;
//            btnCancelarEliminación.setEnabled( = false;
//
//        }
//        private void btnModificarListoUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmModificarUsuario.Modificar();
//            ofrmModificarUsuario.Visible = false;
//            ConfigurarInicialUsuario();
//
//        }
//        private void btnCancelarModificarUsuario_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmModificarUsuario.configurarNuevo();
//            ofrmModificarUsuario.Visible = false;
//            ConfigurarInicialUsuario();
//
//        }
//        //endregion
//        //endregion
//        //region Seguridad
//        public void SeguridadM()
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = false;
//            rbSeguridad.Visible = true;
//            ofmInicio.Visible = false;
//            ofrmSeguridadInicio.MdiParent = this;
//            ofrmCambiarContrasenia.MdiParent = this;
//            ofrmSacarBackup.MdiParent = this;
//            try
//            {
//                ofrmSeguridadInicio.Show();
//            }
//            catch
//            {
//                ofrmSeguridadInicio.Visible = true;
//            }
//            InitSkinGallery2();
//            ConfigurarIniciarSeguridad();
//        }
//        void InitSkinGallery2()
//        {
//            DevExpress.XtraBars.Helpers.SkinHelper.InitSkinGallery(dgvSeguridad, true);
//        }
//        public void ConfigurarIniciarSeguridad()
//        {
//            btnInicioSeguridad.setEnabled( = true;
//            btnSeguridadSalir.setEnabled( = true;
//            btnRealizarCambioSeguridad.setEnabled( = true;
//            btnAceptarCambioSeguridad.setEnabled( = false;
//            btnCancelarCambioSeguridad.setEnabled( = false;
//            if (Puesto == "Administrador")
//            {
//                btnSacarCopia.setEnabled( = true;
//                btnRealizarCopiaSeguridad.setEnabled( = false;
//                btnCancelarSacarCopia.setEnabled( = false;
//            }
//            else
//            {
//                rbSacarBackups.Visible = false;
//            }
//        }
//        //region CambiarContrasenia
//        private void btnRealizarCambioSeguridad_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            try
//            {
//                ofrmCambiarContrasenia.Show();
//            }
//            catch
//            {
//                ofrmCambiarContrasenia.Visible = true;
//            }
//            configurarCambiarContrasenia();
//        }
//        public void configurarCambiarContrasenia()
//        {
//            btnInicioSeguridad.setEnabled( = false;
//            btnSeguridadSalir.setEnabled( = false;
//            btnRealizarCambioSeguridad.setEnabled( = false;
//            btnAceptarCambioSeguridad.setEnabled( = true;
//            btnCancelarCambioSeguridad.setEnabled( = true;
//            if (Puesto == "Administrador")
//            {
//                btnSacarCopia.setEnabled( = false;
//                btnRealizarCopiaSeguridad.setEnabled( = false;
//                btnCancelarSacarCopia.setEnabled( = false;
//            }
//            else
//            {
//                rbSacarBackups.Visible = false;
//            }
//        }
//        private void btnAceptarCambioSeguridad_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofrmCambiarContrasenia.Aceptar();
//            rbModificarEmpresa.Minimized = false;
//            ConfigurarIniciarSeguridad();
//        }
//        private void btnCancelarCambioSeguridad_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmCambiarContrasenia.Cancelar();
//            ConfigurarIniciarSeguridad();
//        }
//        //endregion     
//        //region Configuracion
//        private void btnInicioSeguridad_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = true;
//            ofmInicio.Visible = true;
//        }
//        private void btnSeguridadSalir_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbSeguridad.Visible = false;
//            ofmInicio.Visible = true;
//            ofrmCambiarContrasenia.Visible = false;
//            ofrmSeguridadInicio.Visible = false;
//            ofrmSacarBackup.Visible = false;
//        }
//        //endregion
//        //region SacarCopiaDeSeguridad
//        private void btnSacarCopia_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            if (Puesto == "Administrador")
//            {
//                try
//                {
//                    ofrmSacarBackup.Show();
//                }
//                catch
//                {
//                    ofrmSacarBackup.Visible = true;
//                }
//                configurarSacarCopiaSeguridad();
//            }            
//        }
//        public void configurarSacarCopiaSeguridad()
//        {
//            btnInicioSeguridad.setEnabled( = false;
//            btnSeguridadSalir.setEnabled( = false;
//            btnRealizarCambioSeguridad.setEnabled( = false;
//            btnAceptarCambioSeguridad.setEnabled( = false;
//            btnCancelarCambioSeguridad.setEnabled( = false;
//            if (Puesto == "Administrador")
//            {
//                btnSacarCopia.setEnabled( = false;
//                btnRealizarCopiaSeguridad.setEnabled( = true;
//                btnCancelarSacarCopia.setEnabled( = true;
//            }
//            else
//            {
//                rbSacarBackups.Visible = false;
//            }
//        }
//        private void btnRealizarCopiaSeguridad_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofrmSacarBackup.sacarbackup();
//            rbModificarEmpresa.Minimized = false;
//            ConfigurarIniciarSeguridad();
//            ofrmSacarBackup.Visible = false;
//        }
//        private void btnCancelarSacarCopia_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmSacarBackup.Cargardatos();
//            ConfigurarIniciarSeguridad();
//            ofrmSacarBackup.Visible = false;
//        }
//        //endregion
//        //endregion
//        //region Empresa
//        //region ConfiguracionInicialEmpresa
//        public void Empresa()
//        {
//            rbModificarEmpresa.Minimized = false;
//            rbEmpresa.Visible = true;
//            ofmInicio.Visible = false;
//            ofrmNuevoEmpresa.MdiParent = this;
//            ofrmEmpresa.MdiParent = this;
//            ofrmMostarEmpresa.MdiParent = this;
//            ofrmModificarEmpresa.MdiParent = this;
//            try
//            {
//                ofrmEmpresa.Show();
//            }
//            catch
//            {
//                ofrmCliente.Visible = true;
//            }
//            InitSkinGalleryEmpresa();
//            ConfigurarInicialEmpresa();
//        }
//        void InitSkinGalleryEmpresa()
//        {
//            DevExpress.XtraBars.Helpers.SkinHelper.InitSkinGallery(dgvEmpresaEstilos, true);
//        }
//        public void ConfigurarInicialEmpresa()
//        {
//            btnInicioEmpresa.setEnabled( = true;
//            btnSalirEmpresa.setEnabled( = true;
//            btnNuevoEmpresa.setEnabled( = true;
//            btnGuardarNuevoEmpresa.setEnabled( = false;
//            btnCancelarNuevoEmpresa.setEnabled( = false;
//            btnListarEmpresa.setEnabled( = true;
//            btnActualizarListarEmpresa.setEnabled( = true;
//            btnModificarEmpresa.setEnabled( = true;
//            btnModificarEmpresaListo.setEnabled( = false;
//            btnCancelarModificacionEmpresa.setEnabled( = false;
//        }
//        //endregion
//        //region InsertarEmpresa
//        private void btnNuevoEmpresa_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = false;
//            try
//            {
//                ofrmNuevoEmpresa.Show();
//            }
//            catch
//            {
//                ofrmNuevoEmpresa.Visible = true;
//            }
//            ConfigurarInsertarEmpresa();
//        }
//        public void ConfigurarInsertarEmpresa()
//        {
//            btnInicioEmpresa.setEnabled( = false;
//            btnSalirEmpresa.setEnabled( = false;
//            btnNuevoEmpresa.setEnabled( = false;
//            btnGuardarNuevoEmpresa.setEnabled( = true;
//            btnCancelarNuevoEmpresa.setEnabled( = true;
//            btnListarEmpresa.setEnabled( = false;
//            btnActualizarListarEmpresa.setEnabled( = false;
//            btnModificarEmpresa.setEnabled( = false;
//            btnModificarEmpresaListo.setEnabled( = false;
//            btnCancelarModificacionEmpresa.setEnabled( = false;
//        }
//        private void btnGuardarNuevoEmpresa_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmNuevoEmpresa.Insertar();
//            ofrmNuevoEmpresa.Visible = false;
//            ConfigurarInicialEmpresa();
//        }
//        private void btnCancelarNuevoEmpresa_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmNuevoEmpresa.Cancelar();
//            ofrmNuevoEmpresa.Visible = false;
//            ConfigurarInicialEmpresa();
//        }
//        //endregion
//        //region MostrarEmpresa
//        private void btnListarEmpresa_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = false;
//            try
//            { ofrmMostarEmpresa.Show(); }
//            catch
//            { ofrmMostarEmpresa.Visible = true; } 
//        }
//        private void btnActualizarListarEmpresa_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmMostarEmpresa.Actualizar();
//        }
//        //endregion
//        //region  ModificarCliente
//        private void btnModificarEmpresa_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            ofmInicio.Visible = false;
//            rbModificarEmpresa.Minimized = false;
//            try
//            {
//                ofrmModificarEmpresa.Show();
//            }
//            catch
//            {
//                ofrmModificarEmpresa.Visible = true;
//            }
//            ConfigurarModificarEmpresa();
//        }
//        public void ConfigurarModificarEmpresa()
//        {
//            btnInicioEmpresa.setEnabled( = false;
//            btnSalirEmpresa.setEnabled( = false;
//            btnNuevoEmpresa.setEnabled( = false;
//            btnGuardarNuevoEmpresa.setEnabled( = false;
//            btnCancelarNuevoEmpresa.setEnabled( = false;
//            btnListarEmpresa.setEnabled( = false;
//            btnActualizarListarEmpresa.setEnabled( = false;
//            btnModificarEmpresa.setEnabled( = false;
//            btnModificarEmpresaListo.setEnabled( = true;
//            btnCancelarModificacionEmpresa.setEnabled( = true;
//        }
//        private void btnModificarEmpresaListo_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmModificarEmpresa.Modificar();
//            ofrmModificarEmpresa.Visible = false;
//            ConfigurarInicialEmpresa();
//        }
//        private void btnCancelarModificacionEmpresa_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = false;
//            ofrmModificarEmpresa.configurarNuevo();
//            ofrmModificarEmpresa.Visible = false;
//            ConfigurarInicialEmpresa();
//        }
//        //endregion
//        //region Configuracion
//        private void btnInicioEmpresa_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbModificarEmpresa.Minimized = true;
//            ofmInicio.Visible = true;
//        }
//        private void btnSalirEmpresa_ItemClick(object sender, ItemClickEventArgs e)
//        {
//            rbEmpresa.Visible = false;
//            ofmInicio.Visible = true;
//            ofrmMostarEmpresa.Visible = false;
//            ofrmNuevoEmpresa.Visible = false;
//            ofrmModificarEmpresa.Visible = false;
//            ofrmEmpresa.Visible = false;
        }
 
    
    
 public frmPresentacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        btnNuevoCliente14 = new javax.swing.JButton();
        btnNuevoCliente15 = new javax.swing.JButton();
        btnNuevoCliente16 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jToolBar7 = new javax.swing.JToolBar();
        jPanel9 = new javax.swing.JPanel();
        btnClienteInicio = new javax.swing.JButton();
        btnClienteSalir = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        btnClienteNuevo = new javax.swing.JButton();
        btnClienteGuardar = new javax.swing.JButton();
        btnClienteCancelar = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        btnClienteListar = new javax.swing.JButton();
        btnClienteActualizar = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        btnClienteModificar = new javax.swing.JButton();
        btnClienteModificarListo = new javax.swing.JButton();
        btnClienteCancelarModificar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jToolBar8 = new javax.swing.JToolBar();
        jPanel11 = new javax.swing.JPanel();
        btnUsuarioInicio = new javax.swing.JButton();
        btnUsuarioSalir = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        btnUsuarioNuevo = new javax.swing.JButton();
        btnUsuarioGuardar = new javax.swing.JButton();
        btnUsuarioCancelar = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        btnUsuarioListar = new javax.swing.JButton();
        btnUsuarioActualizar = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        btnUsuarioModificar = new javax.swing.JButton();
        btnUsuarioModificarListo = new javax.swing.JButton();
        btnUsuarioCancelarModificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jToolBar11 = new javax.swing.JToolBar();
        jPanel14 = new javax.swing.JPanel();
        btnNuevoCliente3 = new javax.swing.JButton();
        btnNuevoCliente22 = new javax.swing.JButton();
        btnNuevoCliente23 = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        btnNuevoCliente113 = new javax.swing.JButton();
        btnNuevoCliente114 = new javax.swing.JButton();
        btnNuevoCliente115 = new javax.swing.JButton();
        jPanel44 = new javax.swing.JPanel();
        btnNuevoCliente116 = new javax.swing.JButton();
        btnNuevoCliente117 = new javax.swing.JButton();
        btnNuevoCliente118 = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        btnNuevoCliente119 = new javax.swing.JButton();
        btnNuevoCliente120 = new javax.swing.JButton();
        btnNuevoCliente121 = new javax.swing.JButton();
        jPanel46 = new javax.swing.JPanel();
        btnNuevoCliente122 = new javax.swing.JButton();
        btnNuevoCliente123 = new javax.swing.JButton();
        btnNuevoCliente124 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu6.setText("jMenu6");

        jMenu7.setText("jMenu7");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insertar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnNuevoCliente14.setText("jButton3");

        btnNuevoCliente15.setText("jButton3");

        btnNuevoCliente16.setText("jButton3");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(btnNuevoCliente14, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoCliente15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoCliente16))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNuevoCliente16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNuevoCliente14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNuevoCliente15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jToolBar7.setRollover(true);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuracion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnClienteInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/folder_home.png"))); // NOI18N
        btnClienteInicio.setText("Inicio");
        btnClienteInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClienteInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClienteInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteInicioActionPerformed(evt);
            }
        });

        btnClienteSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/button_cancel.png"))); // NOI18N
        btnClienteSalir.setText("Salir");
        btnClienteSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClienteSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClienteSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(btnClienteInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClienteSalir))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClienteSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
            .addComponent(btnClienteInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insertar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnClienteNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add_user.png"))); // NOI18N
        btnClienteNuevo.setText("Nuevo");
        btnClienteNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClienteNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnClienteGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        btnClienteGuardar.setText("Guardar");
        btnClienteGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClienteGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnClienteCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agt_stop.png"))); // NOI18N
        btnClienteCancelar.setText("Cancelar");
        btnClienteCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClienteCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(btnClienteNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClienteGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClienteCancelar))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClienteCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
            .addComponent(btnClienteNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClienteGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mostrar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnClienteListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agt_family.png"))); // NOI18N
        btnClienteListar.setText("Listar Clientes");
        btnClienteListar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClienteListar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnClienteActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reload_page.png"))); // NOI18N
        btnClienteActualizar.setText("Actualizar");
        btnClienteActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClienteActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(btnClienteListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClienteActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClienteListar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
            .addComponent(btnClienteActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnClienteModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_user.png"))); // NOI18N
        btnClienteModificar.setText("Modificar Cliente");
        btnClienteModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClienteModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnClienteModificarListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_group.png"))); // NOI18N
        btnClienteModificarListo.setText("Modificar");
        btnClienteModificarListo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClienteModificarListo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnClienteCancelarModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/button_cancel.png"))); // NOI18N
        btnClienteCancelarModificar.setText("Cancelar Modificacion");
        btnClienteCancelarModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClienteCancelarModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(btnClienteModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClienteModificarListo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClienteCancelarModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClienteCancelarModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClienteModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClienteModificarListo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jToolBar7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(470, 470, 470))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jToolBar7, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("CLIENTE", jPanel4);

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jToolBar8.setRollover(true);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuracion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnUsuarioInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/folder_home.png"))); // NOI18N
        btnUsuarioInicio.setText("Inicio");
        btnUsuarioInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuarioInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioInicioActionPerformed(evt);
            }
        });

        btnUsuarioSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/button_cancel.png"))); // NOI18N
        btnUsuarioSalir.setText("Salir");
        btnUsuarioSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(btnUsuarioInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarioSalir))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUsuarioSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarioInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insertar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnUsuarioNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add_user.png"))); // NOI18N
        btnUsuarioNuevo.setText("Nuevo");
        btnUsuarioNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnUsuarioGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        btnUsuarioGuardar.setText("Guardar");
        btnUsuarioGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnUsuarioCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agt_stop.png"))); // NOI18N
        btnUsuarioCancelar.setText("Cancelar");
        btnUsuarioCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(btnUsuarioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarioGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarioCancelar))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUsuarioCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
            .addComponent(btnUsuarioNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarioGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mostrar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnUsuarioListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agt_family.png"))); // NOI18N
        btnUsuarioListar.setText("Listar Usuarios");
        btnUsuarioListar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioListar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnUsuarioActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reload_page.png"))); // NOI18N
        btnUsuarioActualizar.setText("Actualizar");
        btnUsuarioActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(btnUsuarioListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUsuarioActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUsuarioListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarioActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnUsuarioModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_user.png"))); // NOI18N
        btnUsuarioModificar.setText("Modificar Usuario");
        btnUsuarioModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnUsuarioModificarListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_group.png"))); // NOI18N
        btnUsuarioModificarListo.setText("Modificar");
        btnUsuarioModificarListo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioModificarListo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnUsuarioCancelarModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/button_cancel.png"))); // NOI18N
        btnUsuarioCancelarModificar.setText("Cancelar Modificacion");
        btnUsuarioCancelarModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioCancelarModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(btnUsuarioModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarioModificarListo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUsuarioCancelarModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUsuarioCancelarModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarioModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarioModificarListo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jToolBar8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(470, 470, 470))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jToolBar8, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 231, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("USUARIO", jPanel5);

        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jToolBar11.setRollover(true);

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuracion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnNuevoCliente3.setText("jButton3");

        btnNuevoCliente22.setText("jButton3");

        btnNuevoCliente23.setText("jButton3");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(btnNuevoCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoCliente22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoCliente23))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNuevoCliente23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNuevoCliente3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNuevoCliente22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel43.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insertar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnNuevoCliente113.setText("jButton3");

        btnNuevoCliente114.setText("jButton3");

        btnNuevoCliente115.setText("jButton3");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addComponent(btnNuevoCliente113, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoCliente114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoCliente115))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNuevoCliente115, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
            .addComponent(btnNuevoCliente113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNuevoCliente114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel44.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mostrar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnNuevoCliente116.setText("jButton3");

        btnNuevoCliente117.setText("jButton3");

        btnNuevoCliente118.setText("jButton3");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(btnNuevoCliente116, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoCliente117)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoCliente118))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNuevoCliente118, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
            .addComponent(btnNuevoCliente116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNuevoCliente117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel45.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnNuevoCliente119.setText("jButton3");

        btnNuevoCliente120.setText("jButton3");

        btnNuevoCliente121.setText("jButton3");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addComponent(btnNuevoCliente119, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoCliente120)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoCliente121))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNuevoCliente121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNuevoCliente119, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNuevoCliente120, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel46.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insertar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnNuevoCliente122.setText("jButton3");

        btnNuevoCliente123.setText("jButton3");

        btnNuevoCliente124.setText("jButton3");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addComponent(btnNuevoCliente122, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoCliente123)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoCliente124))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNuevoCliente124, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
            .addComponent(btnNuevoCliente122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNuevoCliente123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jToolBar11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(470, 470, 470))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", jPanel1);
        jTabbedPane1.addTab("tab4", jScrollPane1);

        jMenu4.setText("File");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 294, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioInicioActionPerformed
        // TODO add your handling code here:
        
//            rbModificarEmpresa.Minimized = true;
            //Inicio.setVisible(true);
    }//GEN-LAST:event_btnUsuarioInicioActionPerformed

    private void btnClienteInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClienteInicioActionPerformed

    private void btnClienteSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteSalirActionPerformed
        // TODO add your handling code here:
        // rbCliente.setVisible = false;
          //  ofmInicio.setVisible = true;
            //ofrmMostarCliente.setVisible( false);
            //ofrmNuevoCliente.Visible = false;
            //ofrmModificarCliente.Visible = false;
            //ofrmEliminarCliente.Visible=false;
            //ofrmCliente.Visible = false;
        
        
    }//GEN-LAST:event_btnClienteSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPresentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClienteActualizar;
    private javax.swing.JButton btnClienteCancelar;
    private javax.swing.JButton btnClienteCancelarModificar;
    private javax.swing.JButton btnClienteGuardar;
    private javax.swing.JButton btnClienteInicio;
    private javax.swing.JButton btnClienteListar;
    private javax.swing.JButton btnClienteModificar;
    private javax.swing.JButton btnClienteModificarListo;
    private javax.swing.JButton btnClienteNuevo;
    private javax.swing.JButton btnClienteSalir;
    private javax.swing.JButton btnNuevoCliente113;
    private javax.swing.JButton btnNuevoCliente114;
    private javax.swing.JButton btnNuevoCliente115;
    private javax.swing.JButton btnNuevoCliente116;
    private javax.swing.JButton btnNuevoCliente117;
    private javax.swing.JButton btnNuevoCliente118;
    private javax.swing.JButton btnNuevoCliente119;
    private javax.swing.JButton btnNuevoCliente120;
    private javax.swing.JButton btnNuevoCliente121;
    private javax.swing.JButton btnNuevoCliente122;
    private javax.swing.JButton btnNuevoCliente123;
    private javax.swing.JButton btnNuevoCliente124;
    private javax.swing.JButton btnNuevoCliente14;
    private javax.swing.JButton btnNuevoCliente15;
    private javax.swing.JButton btnNuevoCliente16;
    private javax.swing.JButton btnNuevoCliente22;
    private javax.swing.JButton btnNuevoCliente23;
    private javax.swing.JButton btnNuevoCliente3;
    private javax.swing.JButton btnUsuarioActualizar;
    private javax.swing.JButton btnUsuarioCancelar;
    private javax.swing.JButton btnUsuarioCancelarModificar;
    private javax.swing.JButton btnUsuarioGuardar;
    private javax.swing.JButton btnUsuarioInicio;
    private javax.swing.JButton btnUsuarioListar;
    private javax.swing.JButton btnUsuarioModificar;
    private javax.swing.JButton btnUsuarioModificarListo;
    private javax.swing.JButton btnUsuarioNuevo;
    private javax.swing.JButton btnUsuarioSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar11;
    private javax.swing.JToolBar jToolBar7;
    private javax.swing.JToolBar jToolBar8;
    // End of variables declaration//GEN-END:variables
}
