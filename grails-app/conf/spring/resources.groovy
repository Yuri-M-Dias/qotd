// Place your Spring DSL code here
beans = {
    h2Server(org.h2.tools.Server, "-tcp,-tcpPort,8043") { bean ->
        bean.factoryMethod = "createTcpServer"
        bean.initMethod = "start"
        bean.destroyMethod = "stop"
    }
}
