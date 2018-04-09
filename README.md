# zipkindemo

1. zipkin server:
	download D:\workspace\zipkin-server-2.5.1-exec.jar, 
	run it: java -jar zipkin-server-2.5.1-exec.jar
	access the GUI: http://localhost:9411
2. Rest server:
	Service1 project: 
	http://localhost:8081/service1/api/date
	http://localhost:8081/service1/swagger-ui.html
3. Rest client:
	http://localhost:8080/brave/api/call