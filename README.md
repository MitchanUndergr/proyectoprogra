# proyectoprogra
Los cambios que se hicieron son los siguientes:

Primero se creo una clase estatica llamada GuardaDatos que crea 3 archivos y se encarga de guardar datos en ellos. Estos archivos se usaan en las clases logicas.

Desde Main se llama a los metodos de interfaz Grafica y a los metodos de creacion de GuardaDatos.

InterfazGrafica se reestructura y tiene un nuevo metodo llamado BarrasSeleccion para que sea mas intuitivo.

Pasajes se divide en las clases Fltro_Pasajes y PasajesGUI. La primera contiene la logica a utilizar en PasajesGUI.

Lo que anteriormente era Asientos y AsientosDob, donde asientos contenia la logica e interfaz grafica del tipo asientos Semi cama y AsientosDob tenia la logica e interfaz grafica del tipo de asientos Salon Cama, ahora se dividen en las clases: Asientos, que contiene la logica relacionada a asientos semi cama y salon cama; AsientosGUI (clase abstracta) que tiene metodos a utilizar en: AsientosSemiGUI (interfaz grafica de Semi cama) y AsientosSalonGUI (interfaz grafica de salon cama).

Se crea tambien AsientoGUIFactory que se encarga de fabricar tipos de AsientosGUI.

Reserva se divide en dos clases: Reserva, que contiene la logica de Reserva y ReservaGUI que representa la interfaz grafica de Reserva

Se actualiza javadoc y se crean pruebas unitarias de las clases logicas.

Se actualiza el informe. 
