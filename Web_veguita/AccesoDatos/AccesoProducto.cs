using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Negocio;

namespace AccesoDatos
{
    public class AccesoProducto
    {
        public static List<Producto> ListarProductos()
        {
            List<Producto> lista = null;
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = bd.PRODUCTO.ToList();
                    lista = new List<Producto>();
                    foreach (var item in query)
                    {
                        Producto prod = new Producto();
                        prod.IdProducto = Convert.ToInt32(item.ID_PRODUCTO);
                        prod.Nombre = item.NOMBRE_PRODUCTO;
                        prod.Categoria = item.CATEGORIA;
                        prod.Precio = Convert.ToInt32(item.PRECIO);
                        prod.Proveedor = AccesoProveedor.BuscarProveedorPorId(Convert.ToInt32(item.PROVEEDOR_ID_PROVEEDOR));
                        prod.Stock = Convert.ToInt32(item.STOCK);
                        lista.Add(prod);
                    }

                }
                return lista;
            }
            catch (Exception)
            {
                return null;
            }
        }

        public static List<Producto> ListarProductosPorCategoria(String parCategoria)
        {
            List<Producto> lista = null;
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = bd.PRODUCTO.Where(s => s.CATEGORIA == parCategoria).ToList();
                    lista = new List<Producto>();
                    foreach (var item in query)
                    {
                        Producto prod = new Producto
                        {
                            IdProducto = Convert.ToInt32(item.ID_PRODUCTO),
                            Nombre = item.NOMBRE_PRODUCTO,
                            Categoria = item.CATEGORIA,
                            Precio = Convert.ToInt32(item.PRECIO),
                            Proveedor = AccesoProveedor.BuscarProveedorPorId(Convert.ToInt32(item.PROVEEDOR_ID_PROVEEDOR)),
                            Stock = Convert.ToInt32(item.STOCK)
                        };
                        lista.Add(prod);
                    }

                }
                return lista;
            }
            catch (Exception)
            {
                return null;
            }
        }

        public static List<Producto> ListarProductosPorRangoPrecio(int parMin, int parMax)
        {
            List<Producto> lista = null;
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = bd.PRODUCTO.Where(s => s.PRECIO >= parMin && s.PRECIO <= parMax).ToList();
                    lista = new List<Producto>();
                    foreach (var item in query)
                    {
                        Producto prod = new Producto
                        {
                            IdProducto = Convert.ToInt32(item.ID_PRODUCTO),
                            Nombre = item.NOMBRE_PRODUCTO,
                            Categoria = item.CATEGORIA,
                            Precio = Convert.ToInt32(item.PRECIO),
                            Proveedor = AccesoProveedor.BuscarProveedorPorId(Convert.ToInt32(item.PROVEEDOR_ID_PROVEEDOR)),
                            Stock = Convert.ToInt32(item.STOCK)
                        };
                        lista.Add(prod);
                    }

                }
                return lista;
            }
            catch (Exception)
            {
                return null;
            }
        }

        public static List<Producto> ListarProductosPorProveedor(String parProveedor)
        {
            List<Producto> lista = null;
            try
            {
                using (Entities bd = new Entities())
                {
                    var id = bd.PROVEEDOR.Where(s => s.NOMBRE_PROVEEDOR == parProveedor).Single();

                    var query = bd.PRODUCTO.Where(s => s.PROVEEDOR_ID_PROVEEDOR == id.ID_PROVEEDOR).ToList();
                    lista = new List<Producto>();
                    foreach (var item in query)
                    {
                        Producto prod = new Producto
                        {
                            IdProducto = Convert.ToInt32(item.ID_PRODUCTO),
                            Nombre = item.NOMBRE_PRODUCTO,
                            Categoria = item.CATEGORIA,
                            Precio = Convert.ToInt32(item.PRECIO),
                            Proveedor = AccesoProveedor.BuscarProveedorPorId(Convert.ToInt32(item.PROVEEDOR_ID_PROVEEDOR)),
                            Stock = Convert.ToInt32(item.STOCK)
                        };
                        lista.Add(prod);
                    }
                }
                return lista;
            }
            catch (Exception)
            {
                return null;
            }
        }

        public static Producto BuscarProductoPorId(int parId)
        {
            Producto prod = new Producto();
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = bd.PRODUCTO.Where(s => s.ID_PRODUCTO == parId).Single();
                    if (query != null)
                    {
                        prod.IdProducto = Convert.ToInt32(query.ID_PRODUCTO);
                        prod.Nombre = query.NOMBRE_PRODUCTO;
                        prod.Categoria = query.CATEGORIA;
                        prod.Precio = Convert.ToInt32(query.PRECIO);
                        prod.Proveedor = AccesoProveedor.BuscarProveedorPorId(Convert.ToInt32(query.PROVEEDOR_ID_PROVEEDOR));
                        prod.Stock = Convert.ToInt32(query.STOCK);
                    }
                }
                return prod;
            }
            catch (Exception)
            {
                return null;
            }
        }
    }
}
