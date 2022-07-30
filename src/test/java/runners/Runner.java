package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@db",
        dryRun = false
)

public class Runner {
    /*
    Bir framework de bir tek runner classi yeterli olabilir
    Runner Classin body sinde hicbir sey olmaz
    Runner Classimizi onemli yapan 2 adet annotation dur
    @RunWith notasyonu Runner classina calisma ozelligi katar
    sirf bu ozellik nedeniyle cucumberde junit kullanilir

    features: Runner dosyasinin feature dosyalarini nerede bulacagini tarif eder
    glue: step definitions lari nerede bulacagimizi gosterir
    tags: o an hangi tag i calistirmak istiyorsak onu beller

    dryRun : iki secenek var;
    dryRun= true; yazdigimizde  testimizi calistirmadan sadece eksik adimlarimizi bize verir
    dryRun=false; yazdigimizda testler calisir

     */
}
