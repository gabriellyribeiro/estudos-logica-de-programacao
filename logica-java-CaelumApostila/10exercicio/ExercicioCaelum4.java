class ExercicioCaelum4 {
    public static void main(String[] args) {
        /*  No código do exercício anterior, aumente a quantidade de números que terão os fatoriais impressos,
        até 20, 30, 40. Em um determinado momento, além desse cálculo demorar, vai começar a mostrar
        respostas completamente erradas. Por quê?
        Mude de int para long para ver alguma mudança.*/
        
        int fatorial = 1;
        for (int i = 1; i < 21; i++) {
        	fatorial = fatorial * i;
                        System.out.println(fatorial); 
        }
        
    }
}
