package classe;

public class Processo02 implements Runnable  {

	@Override
	public void run() {
		
		String nome = Thread.currentThread().getName();
		System.out.println(nome);
		
	}

}
