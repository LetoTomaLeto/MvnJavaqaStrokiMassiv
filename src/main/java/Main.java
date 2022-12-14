import ru.netology.stats.SalesStatService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        long[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        SalesStatService service = new SalesStatService();

        long sum = service.sumSales(arr);
        System.out.println(Arrays.toString(new String[]{"Сумма продаж " + sum}));

        long midSum = service.midSumSales(arr);
        System.out.println(Arrays.toString(new String[]{"Средняя сумма всех продаж в месяц " + midSum}));

        long maxMonth = service.peakSales(arr);
        System.out.println(Arrays.toString(new String[]{maxMonth + " - месяц, в котором был пик продаж (осуществлены продажи на максимальную сумму)"}));

        long minMonth = service.minSales(arr);
        System.out.println(Arrays.toString(new String[]{minMonth + " - месяц, в котором был минимум продаж (осуществлены продажи на минимальную сумму)"}));

        long calcMinMonthSales = service.sumMonthMinSales(arr);
        System.out.println(Arrays.toString(new String[]{calcMinMonthSales + " - Кол-во месяцев, в которых продажи были ниже среднего"}));

        long calcMaxMonthSales = service.sumMonthMaxSales(arr);
        System.out.println(Arrays.toString(new String[]{calcMaxMonthSales + " - Кол-во месяцев, в которых продажи были выше среднего"}));
    }
}
