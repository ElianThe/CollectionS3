
public class AdresseIP implements Comparable<AdresseIP>{

    private String ip;

    public AdresseIP(String i){
        this.ip = i;
    }

    @Override
    public int compareTo(AdresseIP adresseIP) {
        String [] thisIp = ip.split("\\.");
        String [] otherIp = adresseIP.getIp().split("\\.");
        boolean trouve = false;
        int i =0;
        int res = 0;
        while (! trouve && i<4){
            if (Integer.parseInt(thisIp[i]) < Integer.parseInt(otherIp[i])){
                trouve = true;
                res = -1;
            } else if (Integer.parseInt(thisIp[i]) > Integer.parseInt(otherIp[i])){
                trouve = true;
                res = 1;
            } else {
                i++;
            }
        }
        return res;
    }


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "AdresseIP{" +
                "ip='" + ip + '\'' +
                '}';
    }
}
