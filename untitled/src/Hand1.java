public class Pa implements Hand {

   private String HAND_NAME = "Pa";



   /**

    手の強弱を比較する。

    返り値 -1 : 自身が引数で指定した手より弱い

    　　　　0 : 自身が引数で指定した手と同じ

    　　　　1 : 自身が引数で指定した手より強い

    */

   public int compare(Hand hand) {

       if(Pa instanceof Gu) {    //チョキ　vs グー（自分）

           return 1;

       } else if(Pa instanceof Cyoki) {    //パー　vs グー（自分）

           return -1;

       } else {

           return 0;    //グー　vs グー（自分）

       }

   }



   public String getHandName() {

       return this.HAND_NAME;

   }

}




