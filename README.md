# P.A.P.E.R.
PAPER (Private Application of Electronic Records) EMR software system

### Short Summary

An EMR System written in Java using a NoSQL (*mongoDB*) backend, with as small a resource footprint as possible.  Initially designed to run with a client/host architecture using a client application deployed to workstations, future releases will support web applications by leveraging the power of Apache Tomcat.  Moreover, these future releases will also support horizontal scaling for both the server application and the database backend, eliminating the hassle of purchasing high-end machines to support a growing RDB, as well as providing redundancy in availability and data storage.

## System Requirements

For the present time, we are only supporting setups where the database backend and server application are hosted on the same machine.

### Client Requirements

#### If running Linux

For the ARM architecture, the Raspberry Pi 3B+ or and equivalent SBC are supported.  For the x86 architecture, a dual-core CPU and 2GB of RAM are required (*although 4GB is strongly recommened*).

#### If running Windows or MacOS

A quad-core i3 CPU (*or greater*) and 8GB of RAM.


### Server Requirements

#### If running Linux

We do not recommend running the server-side application on a SBC due to the limitation of the ARM based chips supplied with virtually all SBCs.  Thus, we **strongly** recommend using an x86 based machine for hosting the server-side application and database.  For such a machine, running Linux, a quad-core i3 CPU and 8GB of RAM are the absolute minimum; however, we recommend a quad-core i5 and 16GB of RAM as a safer minimum.  As the software develops, we will update this sections with information on how to scale the server(s) based on the size of the use-case.

#### If running Windows or MacOS

We do not recommend running the server-side application on Windows or MacOS, expect for development and testing purposes.  That said, minimum requirements on these operating systems are a quad-core i5 CPU and 16GB of RAM.


### _NOTES_

_**SBC** = Single Board Computer_