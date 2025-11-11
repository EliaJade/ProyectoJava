package es.cursojava.bbdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import es.cursojava.utilidades.UtilidadesBD;

public class ConsultaProductos {
    private static final String CONSULTA_PRODUCTOS="SELECT ID, NOMBRE, CATEGORIA, PRECIO, STOCK, FECHA_ALTA, ESTADO, CODIGO_SKU, CREADO_POR, IVA "
    		+ "FROM tb_PRODUCTOS_profe";
    public static void main(String[] args) {

    	consultaProductos();
    }

    public static void consultaProductos() {
        
        Connection conexion = UtilidadesBD.crearConexion();
        Statement st = null;
        ResultSet rs = null;
        List<ProductosProfe> productos = new CopyOnWriteArrayList();
        try {
            st = conexion.createStatement();
            rs = st.executeQuery(CONSULTA_PRODUCTOS);
            System.out.println("Enters try");
            while(rs.next()){
            	System.out.println("======================");
                int id = rs.getInt("ID");
                System.out.println(id);
                String nombre = rs.getString("NOMBRE");
                System.out.println(nombre);
                String categoria =rs.getString("CATEGORIA");
                System.out.println(categoria);
                double precio = rs.getDouble("PRECIO");
                System.out.println(precio);
                int stock = rs.getInt("STOCK");
                System.out.println(stock);
                Date fechaAlta = rs.getDate("FECHA_ALTA");
                System.out.println(fechaAlta);
                String estado = rs.getString("ESTADO");
                System.out.println(estado);
                String codigoSku = rs.getString("CODIGO_SKU");
                System.out.println(codigoSku);
                String creadoPor = rs.getString("CREADO_POR");
                System.out.println(creadoPor);
                int iva = rs.getInt("IVA");

                
                System.out.println(iva);
                ProductosProfe producto= new ProductosProfe(id, nombre, categoria, precio, stock, fechaAlta, estado, codigoSku, creadoPor, iva);
                productos.add(producto);
                

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            UtilidadesBD.cierraConexion(conexion);
            try {
                st.close();
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for (ProductosProfe producto : productos) {

            System.out.println(producto);
		}
        System.out.println("TERMINA");
    }


}
