package controller;

//extends Thread
//Par�etros por construtor
//m�todo run

public class ThreadId extends Thread{

	private int idThread;
	
	public  ThreadId(int idThread) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
		//s� sexecuta o que est� aqui dentro
		System.out.println(idThread);
	}
}
