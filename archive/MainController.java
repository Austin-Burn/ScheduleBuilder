import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Queue;
import java.util.Deque;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    private HashMap<Integer, String> calendar = new HashMap<>();
    this.name = name;
    
    //                   ^ maybe change to arraylist<int, String>
    public MainController() {
         //load calendar data here
    }

    @GetMapping("/login/")
    public static @ResponseBody Boolean Login(@RequestParam String UserName){
        if (Main.loginMap.containskey(UserName)) {
            MainController instance = new MainController();
            Main.put(Username, instance);
            return true;
        }else{
            return false;
        }
    }

    @GetMapping("/read/")
    public @ResponseBody String read(@RequestParam String Pathing) {
        return this.calendar.get(Pathing);
    }

    @PutMapping("/write/")
    public void write(@RequestParam String pathing, @RequestParam String Data) {
        this.calendar.put(Pathing, Data);
    }
    @DeleteMapping("/delete/")
    public void delete(@RequestParam String pathing) {
        this.calendar.delete(pathing);
    }
       
    
    @PostMapping("/push/")
    public void push(){
        Main.users.put(name, calendar);
    }


}