package main;



public class Manager {
	public static void main(String[] args) {
		//结果并不是按顺序的了，说明线程调度还是不可预期
		Server server = new Server();
		server.start();
		Client client = new Client("0000000");
		client.start();
		Client client1 = new Client("1111111");
		client1.start();
		Client client2 = new Client("222222");
		client2.start();
		Client client3 = new Client("333333");
		client3.start();
		Client client4 = new Client("444444");
		client4.start();
		Client client5 = new Client("555555");
		client5.start();
	}
}
