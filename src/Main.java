/*hussein  1/12 */
public class Main {
    public static void main(String[] args) {


        String city = "Columbus";
        int zipCode = 43215;
        double weather[] = {32, 25, 27, 40, 45};
        System.out.println("city " + city);
        System.out.println(zipCode);

        double sum = 0;


        for (int i = 0; i < weather.length; i++) {
            sum += weather[i]/weather.length;
        }
        System.out.println(sum);
    }
}
