package NivelAvancado.Teste;

public class Main {
    public static void main(String[] args) {
        System.out.println(month("jan", 4));
    }

    public static String month (String month, Integer number) {
        int monthIndex = -1;

        String[] months = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};

        for (int i = 0; i < months.length; i++) {
            if (month.equalsIgnoreCase(months[i])) {
                monthIndex = i;
            }
        }

        if (monthIndex == -1) {
            System.out.println("Invalid month!");
            return null;
        }

        if (!(number > -1 && number < 25)) {
            System.out.println("Number must be between 0 and 24");
            return null;
        }

        int newMonthIndex = (monthIndex + number) % 12;
        return months[newMonthIndex];
    }

}
