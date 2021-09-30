public class Global{
    private static int var = 5;

    public static int getVar(){
        return Global.var;
    }

    //If you do not want to change the var ever then do not include this
    public static void setVar(int var){
        Global.var = var;
    }
}
