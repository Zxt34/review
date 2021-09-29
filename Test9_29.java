import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test9_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] time = str.split(";");
        HashMap<String,String> openStart = new HashMap<>();
        ArrayList<String> openS = new ArrayList<>();
        HashMap<String,String> openEnd = new HashMap<>();
        ArrayList<String> openE = new ArrayList<>();
        HashMap<String,String> closeStart = new HashMap<>();
        ArrayList<String> closeS = new ArrayList<>();
        HashMap<String,String> closeEnd = new HashMap<>();
        ArrayList<String> closeE = new ArrayList<>();
        for (int i = 0; i < time.length; i++) {
            String[] temp = time[i].split(",");
            if(temp[0] == "0"){
                String[] timeCh = temp[1].split("-");
                String[] closeStartCh = timeCh[0].split(":");
                String[] closeEndCh = timeCh[1].split(":");
                if(closeStart.containsKey(closeStartCh[0])){
                    if(Integer.parseInt(closeStart.get(closeStartCh[0])) < Integer.parseInt(closeStartCh[1])){
                        closeStart.put(closeStartCh[0],closeStartCh[1]);
                        closeS.add(closeStartCh[0] + ":" + closeStartCh[1]);
                    }
                }else{
                    closeS.add(closeStartCh[0] + ":" + closeStartCh[1]);
                    closeStart.put(closeStartCh[0],closeStartCh[1]);
                }
                if(closeEnd.containsKey(closeEndCh[0])){
                    if(Integer.parseInt(closeEnd.get(closeEndCh[0])) > Integer.parseInt(closeEndCh[1])){
                        closeStart.put(closeEndCh[0],closeEndCh[1]);
                        closeE.add(0,closeEndCh[0] + ":" + closeEndCh[1]);
                    }
                }else{
                    closeE.add(0,closeEndCh[0] + ":" + closeEndCh[1]);
                    closeStart.put(closeEndCh[0],closeEndCh[1]);
                }
            }else if(temp[0] == "1"){
                String[] timeCh = temp[1].split("-");
                String[] openStartCh = timeCh[0].split(":");
                String[] openEndCh = timeCh[1].split(":");
                if(openStart.containsKey(openStartCh[0])){
                    if(Integer.parseInt(openStart.get(openStartCh[0])) < Integer.parseInt(openStartCh[1])){
                        openStart.put(openStartCh[0],openStartCh[1]);
                        openS.add(openStartCh[0] + ":" + openStartCh[1]);
                    }
                }else{
                    openS.add(openStartCh[0] + ":" + openStartCh[1]);
                    openStart.put(openStartCh[0],openStartCh[1]);
                }
                if(openEnd.containsKey(openEndCh[0])){
                    if(Integer.parseInt(openEnd.get(openEndCh[0])) > Integer.parseInt(openEndCh[1])){
                        openStart.put(openEndCh[0],openEndCh[1]);
                        openE.add(0,openEndCh[0] + ":" + openEndCh[1]);
                    }
                }else{
                    openE.add(0,openEndCh[0] + ":" + openEndCh[1]);
                    openStart.put(openEndCh[0],openEndCh[1]);
                }
            }
        }
        ArrayList<String> res = new ArrayList<>();
        String[] openStart1 = openS.get(openS.size() - 1).split(":");
        String[] openStart2 = closeS.get(closeS.size() - 1).split(":");
        if(Integer.parseInt(openStart1[0]) > Integer.parseInt(openStart2[0])){
            res.add(openS.get(openS.size() - 1));
        }else if(Integer.parseInt(openStart1[0]) < Integer.parseInt(openStart2[0])){
            res.add(closeS.get(closeS.size() - 1));
        }else{
            if(Integer.parseInt(openStart1[1]) >= Integer.parseInt(openStart2[1])){
                res.add(openS.get(openS.size() - 1));
            }else if(Integer.parseInt(openStart1[1]) < Integer.parseInt(openStart2[1])) {
                res.add(closeS.get(closeS.size() - 1));
            }
        }
        String[] closeEnd1 = openE.get(0).split(":");
        String[] closeEnd2 = closeE.get(0).split(":");
        if(Integer.parseInt(closeEnd1[0]) > Integer.parseInt(closeEnd2[0])){
            res.add(openE.get(0));
        }else if(Integer.parseInt(closeEnd1[0]) < Integer.parseInt(closeEnd2[0])){
            res.add(closeE.get(0));
        }else{
            if(Integer.parseInt(closeEnd1[1]) >= Integer.parseInt(closeEnd2[1])){
                res.add(openE.get(0));
            }else if(Integer.parseInt(closeEnd1[1]) < Integer.parseInt(closeEnd2[1])) {
                res.add(closeE.get(0));
            }
        }
        for (int i = 0; i < res.size(); i++) {
            if(i % 2 == 0){
                System.out.println(res.get(i) + "-");
            }
            if(i % 2 == 1){
                System.out.println(res.get(i) + ";");
            }
        }

//        String difficult = scanner.nextLine();
//        String income = scanner.nextLine();
//        String worker = scanner.nextLine();
//        String[] difficultCh = difficult.split(",");
//        String[] incomeCh = income.split(",");
//        String[] workerCh = worker.split(",");
//        int res = 0;
//        for (int i = 0; i < workerCh.length; i++) {
//            for (int j = difficultCh.length - 1; j >= 0; j--) {
//                if(Integer.parseInt(difficultCh[j]) <= Integer.parseInt(workerCh[i])){
//                    res += Integer.parseInt(incomeCh[j]);
//                    break;
//                }
//            }
//        }
//        System.out.println(res);
    }
}