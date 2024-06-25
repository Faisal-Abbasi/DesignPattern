public class Faisal {
    private static Faisal faisal;
    private Faisal(){}

    public static Faisal getFaisal(){
        if(faisal==null){
            //Making it thread safe
            synchronized (Faisal.class){
                if(faisal==null)
                    faisal =new Faisal();
            }

        }
        return faisal;
    }
}
