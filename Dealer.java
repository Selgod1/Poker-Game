import java.util.List;
 
public class Dealer {
    /**
      * Barajar
     * @param list
     * @return
     */
    public List<Poker> washPoke(List<Poker> list){
         System.out.println ("-------- Comience a mezclar ...-------");
        Poker poker = null;
        for (int i = 0; i < list.size(); i++) {
            int randrom = (int)(Math.random()*52);
            poker = list.get(randrom);
            list.set(randrom, list.get(i));
            list.set(i, poker);
        }
         System.out.println ("-------- Fin de barajar! --------");
        return list;
    }
    /**
      * Determinar quién ganó el juego
     * @return
     */
    public void whoWin(Player player,Player player2) {
        if(player.putPoker().compareDianShu(player2.putPoker())==0){
            if(player.putPoker().compare(player2.putPoker())==0) {
                 System.out.println ("-------- Draw ---------");
                return;
            }else if(player.putPoker().compare(player2.putPoker())==1){
                 System.out.println ("-------- Player:" + player.getName () + "Win! ---------");
                return;
            }
            else {
                 System.out.println ("-------- Player:" + player2.getName () + "Win! ---------");
                return;
            }
        }else if(player.putPoker().compareDianShu(player2.putPoker())==1) {
             System.out.println ("-------- Player:" + player.getName () + "Win! ---------");
            return;
        }    
         System.out.println ("-------- Player:" + player2.getName () + "Win! ---------");
    }
    
}