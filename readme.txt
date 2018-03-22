model, service and client -- all decoupled for both http and rpc projects.

news-client has model class and the service (interface) only. This is common to both rpc and http projects. It is a jar dependency for both serice and the consuming app for both http and rpc.
Inder each folder (http | rpc) build each project separately. [no parent pom used]
Tested. Works.
