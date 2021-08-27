package br.com.starter.main;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		Process p = Runtime.getRuntime().exec("cmd /c start cmd.exe /k \"java -jar Teste.jar\"");
		p.waitFor();

	}

}
