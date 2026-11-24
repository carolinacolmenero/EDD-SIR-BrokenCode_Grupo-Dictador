# Proyecto conjunto EDD y SIR Primer Trimestre

## Misión: preparar un entorno de desarrollo reproducible

### 1. Planificar e instalar la máquina virtual

Para instalar una máquina virtual con **Ubuntu** sobre un equipo con **Windows 11 Pro**, procesador **Intel Core i5-11400** (6 núcleos físicos y 12 hilos) y **16 GB de RAM** (15,8 GB utilizables), una propuesta equilibrada consiste en asignar **4 GB de RAM**, **4 núcleos de procesador** y un **disco virtual VDI de 50 GB con reserva dinámica**.

* **Memoria RAM (4 GB):** Da suficiente holgura para que Ubuntu, su entorno gráfico y las aplicaciones de trabajo o desarrollo funcionen sin tirones, mientras deja unos **11,8 GB utilizables** para Windows 11 Pro y evita que el sistema anfitrión se sature o recurra en exceso a la memoria virtual.
* **Procesamiento (4 núcleos):** Aprovecha la mayor parte de los **6 núcleos físicos** disponibles para acelerar compilaciones, actualizaciones y tareas dentro de Ubuntu, pero conserva **2 núcleos físicos libres** para que Windows 11 Pro siga respondiendo con normalidad en segundo plano.
* **Almacenamiento (50 GB en formato VDI dinámico):** Ofrece espacio de sobra para paquetes, herramientas y archivos de proyecto sin obligar a reservar los 50 GB desde el principio, ya que el archivo crece de forma progresiva según el espacio que vaya ocupando la máquina virtual.