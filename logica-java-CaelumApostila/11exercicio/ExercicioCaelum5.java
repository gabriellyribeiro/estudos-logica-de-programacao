class ExercicioCaelum5 {
    public static void main(String[] args) {
        /*  5 - No código do exercício anterior, aumente a quantidade de números que terão os fatoriais impressos,
        até 20, 30, 40. Em um determinado momento, além desse cálculo demorar, vai começar a mostrar
        respostas completamente erradas. Por quê?
        Mude de int para long para ver alguma mudança.*/
        
        long fatorial = 1;
        for (long i = 1; i < 41; i++) {
        	fatorial = fatorial * i;
                        System.out.println(fatorial); 
        }
        
    }
}
