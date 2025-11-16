import java.util.Scanner;

public class Season215 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        // 1) گرفتن افست زمانی از کاربر (به صورت ساعت، می‌تواند اعشاری باشد مانند 4.5)
        System.out.print("Enter the time zone offset to GMT (hours, e.g. 4 ): ");
        double offsetHours = input.nextDouble();

        // 2) گرفتن زمان فعلی بر حسب میلی‌ثانیه و تبدیل به دقیقه
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long totalMinutes = totalSeconds / 60;

        // 3) تبدیل افست از ساعت به دقیقه (پشتیبانی از اعشار)
        long offsetMinutes = Math.round(offsetHours * 60); // مثال: 4.5 -> 270

        // 4) تعداد دقیقه در یک روز
        final int MINUTES_PER_DAY = 24 * 60; // 1440

        // 5) محاسبه‌ی دقیقه‌های تنظیم‌شده با افست و نرمال‌سازی در بازه 0..1439
        long adjustedMinutes = ( (totalMinutes + offsetMinutes) % MINUTES_PER_DAY + MINUTES_PER_DAY ) % MINUTES_PER_DAY;

        // 6) استخراج ساعت و دقیقه محلی
        long displayHour = adjustedMinutes / 60;
        long displayMinute = adjustedMinutes % 60;

        // 7) استخراج ثانیه (از totalSeconds) — برای ثانیه دقیق، باید از ثانیه‌ی کل استفاده کنیم
        long displaySecond = totalSeconds % 60;

        // 8) قالب‌بندی خروجی: مطمئن شویم دقیقه و ثانیه دورقمی نمایش داده شوند
        System.out.printf("The current time is %02d:%02d:%02d (GMT%+.2f)%n",
                          displayHour, displayMinute, displaySecond, offsetHours);

        input.close();
    }
}
