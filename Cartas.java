import java.util.*;
public class Cartas{
    public static void  main(String[] args){
        String[] suit = {"♣️", "♥️", "♦️", "♠️"};
        String[] rank = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"}; 
        String[] deck= new String[52];
        
        for( int i=0; i<deck.length; i++){
           deck[i] = rank[i%13] + suit[i/13];
        }
        
        for(int i=0; i<deck.length;i++){
            int index =(int)(Math.random()*deck.length);
            
            String temp= deck[i];
            deck[i]= deck[index];
            deck[index]=temp;
        }
        for(String u: deck){
            System.out.println(u);
        }
    }
}
/* 
   para las cartas
 * //Añadimos las cartas de cada jugador, junto con su nombre y sus ganancias.
        cartas=new JLabel[juego.jugadores.size()][];
        
        for (int i=0; i<juego.jugadores.size(); i++){
            gbc.gridx=0;
            gbc.gridy=i+1;
            panelReparto.add(jugNombres.get(i),gbc);
            
            gbc.gridx=1;
            gbc.gridy=i+1;
            panelReparto.add(jugGanancias.get(i),gbc);
            
            cartas[i]=new JLabel[5];
            
            for (int j=0; j<5; j++) {
                cartas[i][j]=new JLabel();
                
                if (juego.jugadores.get(i).cartas.get(j).palo().equals("Corazones"))
                    cartas[i][j].setIcon(new ImageIcon(getClass().getResource("1_"+juego.jugadores.get(i).cartas.get(j).numero()+".JPG")));
                
                else if (juego.jugadores.get(i).cartas.get(j).palo().equals("Tréboles"))
                    cartas[i][j].setIcon(new ImageIcon(getClass().getResource("2_"+juego.jugadores.get(i).cartas.get(j).numero()+".JPG")));
                
                else if (juego.jugadores.get(i).cartas.get(j).palo().equals("Rombos"))
                    cartas[i][j].setIcon(new ImageIcon(getClass().getResource("3_"+juego.jugadores.get(i).cartas.get(j).numero()+".JPG")));
                
                else if (juego.jugadores.get(i).cartas.get(j).palo().equals("Picas"))
                    cartas[i][j].setIcon(new ImageIcon(getClass().getResource("4_"+juego.jugadores.get(i).cartas.get(j).numero()+".JPG")));
                
                gbc.gridx=3+j;
                gbc.gridy=i+1;
                panelReparto.add(cartas[i][j],gbc);
            }//EndFor
        }//EndFor*/