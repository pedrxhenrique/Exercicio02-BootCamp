public class Carro{

    private String marcha;
    private boolean ligado;
    private int velocidade;
    //private String virar;


    
    public Carro(String marcha, boolean ligado, int velocidade) {
        this.marcha = "Ponto morto";
        this.ligado = false;
        this.velocidade = 0;
    }

    public String getMarcha() {
        return marcha;
    }
    public void setMarcha(String marcha) {
        this.marcha = marcha;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
   // public String getVirar() {
    //    return virar;
    //}
    //public void setVirar(String virar) {
     //   this.virar = virar;
   // }

    public boolean ligarCarro(){
        if(!ligado){    
            ligado = true;
            System.out.println("Carro ligando ");
            return true;
        }else{
            System.out.println("O carro já está ligado");
            return false;
        }

    }

    public boolean desligarCarro(){
        if(marcha == "Ponto Morto" && velocidade == 0){
        if(ligado){
            ligado = false;
        System.out.println("Carro desligado");
        return false;
        }else{
            System.out.println("Carro já está desligado");
            return true;
        }
    }
        else {
            System.out.println("Não é possível desligar o carro. Certifique-se de estar em ponto morto e com velocidade 0.");
            return false;
    }
    }

    public void acelerarCarro(){
        if(ligado == true){
            if(marcha.equals("Ponto Morto")){
                System.out.println("O carro esta em ponto morto, não é possivel acelerar");
                return;
            }
        if(velocidade == 120){
            System.out.println("Você já está na velocidade maxima");
            return;
        }
        System.out.println("Você está a " + (velocidade++) + "km/h");
        mudarMarcha();
    }else{
        System.out.println("Ligue o carro para poder acelerar");
    }
    }

    public void reduzirCarro(){
        if(velocidade == 0){
            System.out.println("Você já está na velocidade minima");
            return;
            
        }
        System.out.println("Você esta a " + velocidade-- + " km/h");
        mudarMarcha();
    }

    public void mudarMarcha(){
        if(!ligado){
            System.out.println("O carro esta desligado, ligue o carro antes");
            return;
        }
        if(velocidade == 0){
            marcha = "Ponto morto";
        }
        else if(velocidade >= 0 && velocidade <= 20){
            marcha = "Primeira Marcha";
        }else if(velocidade >= 21 && velocidade <= 40){
            marcha = "Segunda Marcha";
        }else if(velocidade >= 41 && velocidade <= 60){
            marcha = "Terceira Marcha";
        }else if(velocidade >= 61 && velocidade <= 80){
            marcha = "Quarta Marcha";
        }else if(velocidade >= 81 && velocidade <= 100){
            marcha = "Quinta Marcha";
        }else if(velocidade >= 101 && velocidade <= 120){
            marcha = "Sexta Marcha";
        }

        System.out.println("Voce esta na " + marcha);
    }

    public void virarLateral(){
        if(velocidade >= 1 && velocidade <= 40){
            System.out.println("Você pode virar para a esquerda ou direita.");
        }else{
            System.out.println("Abaixe a velocidade para poder virar.");
        }
    }


}