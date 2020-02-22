package com.practise;

/**
 * Hello world!
 *
 */
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Crunchify.com
 *
 */

public class apigeeCoreEndpoints {
    public static void main(String args[]) throws Exception {

        String[] hostList = {

                "https://shipstg1-int.api.rccl.com/en/royal/mobile/v2/configurations",
                "https://shipstg1-int.api.rccl.com/en/royal/mobile/v2/generics/countries",
                "https://shipstg1-int.api.rccl.com/en/royal/mobile/v3/ships/AL/time",
                "https://shipstg1-int.api.rccl.com/en/royal/mobile/v2/ships/AL/time",
                "https://shipstg1-int.api.rccl.com/en/royal/mobile/v2/generics/countries",
                "https://shipstg1-int.api.rccl.com/en/royal/mobile/v1/geo/portSequence",
                "https://shipstg1-int.api.rccl.com/en/royal/mobile/v2/ports",
                "https://shipstg1-int.api.rccl.com/en/royal/mobile/v2/ships/AL/deckMaps",
                "https://shipstg1-int.api.rccl.com/en/royal/mobile/v2/agreement",
                "https://shipstg1-int.api.rccl.com/en/royal/mobile/v2/ships",



                "https://int-api.adventure.sh.rccl.com/en/royal/mobile/v2/configurations",
                "https://int-api.adventure.sh.rccl.com/en/royal/mobile/v2/generics/countries",
                "https://int-api.adventure.sh.rccl.com/en/royal/mobile/v3/ships/AL/time",
                "https://int-api.adventure.sh.rccl.com/en/royal/mobile/v2/ships/AL/time",
                "https://int-api.adventure.sh.rccl.com/en/royal/mobile/v2/generics/countries",
                "https://int-api.adventure.sh.rccl.com/en/royal/mobile/v1/geo/portSequence",
                "https://int-api.adventure.sh.rccl.com/en/royal/mobile/v2/ports",
                "https://int-api.adventure.sh.rccl.com/en/royal/mobile/v2/ships/AL/deckMaps",
                "https://int-api.adventure.sh.rccl.com/en/royal/mobile/v2/agreement",
                "https://int-api.adventure.sh.rccl.com/en/royal/mobile/v2/ships",
                "https://int-api.adventure.sh.rccl.com/en/royal/mobile/v2/ships/AL/stats",
                "https://int-api.adventure.sh.rccl.com/en/royal/mobile/v3/ships/AL/stats",
                "https://int-api.adventure.sh.rccl.com/en/royal/mobile/v2/ships/AL/voyages",
                "https://int-api.adventure.sh.rccl.com/en/royal/mobile/v2/weather/ships/AL/sailDate/20180826",

                "https://int-api.allure.sh.rccl.com/en/royal/mobile/v2/configurations",
                "https://int-api.allure.sh.rccl.com/en/royal/mobile/v2/generics/countries",
                "https://int-api.allure.sh.rccl.com/en/royal/mobile/v3/ships/AL/time",
                "https://int-api.allure.sh.rccl.com/en/royal/mobile/v2/ships/AL/time",
                "https://int-api.allure.sh.rccl.com/en/royal/mobile/v2/generics/countries",
                "https://int-api.allure.sh.rccl.com/en/royal/mobile/v1/geo/portSequence",
                "https://int-api.allure.sh.rccl.com/en/royal/mobile/v2/ports",
                "https://int-api.allure.sh.rccl.com/en/royal/mobile/v2/ships/AL/deckMaps",
                "https://int-api.allure.sh.rccl.com/en/royal/mobile/v2/agreement",
                "https://int-api.allure.sh.rccl.com/en/royal/mobile/v2/ships",
                "https://int-api.allure.sh.rccl.com/en/royal/mobile/v2/ships/AL/stats",
                "https://int-api.allure.sh.rccl.com/en/royal/mobile/v3/ships/AL/stats",
                "https://int-api.allure.sh.rccl.com/en/royal/mobile/v2/ships/AL/voyages",
                "https://int-api.allure.sh.rccl.com/en/royal/mobile/v2/weather/ships/AL/sailDate/20180826",


                "https://int-api.enchantment.sh.rccl.com/en/royal/mobile/v2/configurations",
                "https://int-api.enchantment.sh.rccl.com/en/royal/mobile/v2/generics/countries",

            "https://int-api.enchantment.sh.rccl.com/en/royal/mobile/v3/ships/AL/time",
            "https://int-api.enchantment.sh.rccl.com/en/royal/mobile/v2/ships/AL/time",
            "https://int-api.enchantment.sh.rccl.com/en/royal/mobile/v2/generics/countries",
            "https://int-api.enchantment.sh.rccl.com/en/royal/mobile/v1/geo/portSequence",
            "https://int-api.enchantment.sh.rccl.com/en/royal/mobile/v2/ports",
            "https://int-api.enchantment.sh.rccl.com/en/royal/mobile/v2/ships/AL/deckMaps",
            "https://int-api.enchantment.sh.rccl.com/en/royal/mobile/v2/agreement",
            "https://int-api.enchantment.sh.rccl.com/en/royal/mobile/v2/ships",
            "https://int-api.enchantment.sh.rccl.com/en/royal/mobile/v2/ships/AL/stats",
            "https://int-api.enchantment.sh.rccl.com/en/royal/mobile/v3/ships/AL/stats",
            "https://int-api.enchantment.sh.rccl.com/en/royal/mobile/v2/ships/AL/voyages",
            "https://int-api.enchantment.sh.rccl.com/en/royal/mobile/v2/weather/ships/AL/sailDate/20180826",

            "https://int-api.independence.sh.rccl.com/en/royal/mobile/v2/configurations",
             "https://int-api.independence.sh.rccl.com/en/royal/mobile/v2/generics/countries",
            "https://int-api.independence.sh.rccl.com/en/royal/mobile/v3/ships/AL/time",
            "https://int-api.independence.sh.rccl.com/en/royal/mobile/v2/ships/AL/time",
            "https://int-api.independence.sh.rccl.com/en/royal/mobile/v2/generics/countries",
            "https://int-api.independence.sh.rccl.com/en/royal/mobile/v1/geo/portSequence",
            "https://int-api.independence.sh.rccl.com/en/royal/mobile/v2/ports",
            "https://int-api.independence.sh.rccl.com/en/royal/mobile/v2/ships/AL/deckMaps",
            "https://int-api.independence.sh.rccl.com/en/royal/mobile/v2/agreement",
            "https://int-api.independence.sh.rccl.com/en/royal/mobile/v2/ships",
             "https://int-api.independence.sh.rccl.com/en/royal/mobile/v2/ships/AL/stats",
             "https://int-api.independence.sh.rccl.com/en/royal/mobile/v3/ships/AL/stats",
             "https://int-api.independence.sh.rccl.com/en/royal/mobile/v2/ships/AL/voyages",
             "https://int-api.independence.sh.rccl.com/en/royal/mobile/v2/weather/ships/AL/sailDate/20180826",

             "https://int-api.mariner.sh.rccl.com/en/royal/mobile/v2/configurations",
             "https://int-api.mariner.sh.rccl.com/en/royal/mobile/v2/generics/countries", "https://int-api.mariner.sh.rccl.com/en/royal/mobile/v3/ships/AL/time",
             "https://int-api.mariner.sh.rccl.com/en/royal/mobile/v2/ships/AL/time",
            "https://int-api.mariner.sh.rccl.com/en/royal/mobile/v2/generics/countries",
            "https://int-api.mariner.sh.rccl.com/en/royal/mobile/v1/geo/portSequence",
             "https://int-api.mariner.sh.rccl.com/en/royal/mobile/v2/ports",
             "https://int-api.mariner.sh.rccl.com/en/royal/mobile/v2/ships/AL/deckMaps",
            "https://int-api.mariner.sh.rccl.com/en/royal/mobile/v2/agreement",
             "https://int-api.mariner.sh.rccl.com/en/royal/mobile/v2/ships",
             "https://int-api.mariner.sh.rccl.com/en/royal/mobile/v2/ships/AL/stats",
             "https://int-api.mariner.sh.rccl.com/en/royal/mobile/v3/ships/AL/stats",
             "https://int-api.mariner.sh.rccl.com/en/royal/mobile/v2/ships/AL/voyages",
             "https://int-api.mariner.sh.rccl.com/en/royal/mobile/v2/weather/ships/AL/sailDate/20180826",

             "https://int-api.oasis.sh.rccl.com/en/royal/mobile/v2/configurations",
             "https://int-api.oasis.sh.rccl.com/en/royal/mobile/v2/generics/countries",
             "https://int-api.oasis.sh.rccl.com/en/royal/mobile/v3/ships/AL/time",
            "https://int-api.oasis.sh.rccl.com/en/royal/mobile/v2/ships/AL/time",
             "https://int-api.oasis.sh.rccl.com/en/royal/mobile/v2/generics/countries",
             "https://int-api.oasis.sh.rccl.com/en/royal/mobile/v1/geo/portSequence",
             "https://int-api.oasis.sh.rccl.com/en/royal/mobile/v2/ports",
            "https://int-api.oasis.sh.rccl.com/en/royal/mobile/v2/ships/AL/deckMaps",
             "https://int-api.oasis.sh.rccl.com/en/royal/mobile/v2/agreement",
             "https://int-api.oasis.sh.rccl.com/en/royal/mobile/v2/ships",
             "https://int-api.oasis.sh.rccl.com/en/royal/mobile/v2/ships/AL/stats",
             "https://int-api.oasis.sh.rccl.com/en/royal/mobile/v3/ships/AL/stats",
             "https://int-api.oasis.sh.rccl.com/en/royal/mobile/v2/ships/AL/voyages",
             "https://int-api.oasis.sh.rccl.com/en/royal/mobile/v2/weather/ships/AL/sailDate/20180826",

             "http://int-api.serenade.sh.rccl.com/en/royal/mobile/v2/configurations",
             "https://int-api.serenade.sh.rccl.com/en/royal/mobile/v2/generics/countries",
             "https://int-api.serenade.sh.rccl.com/en/royal/mobile/v3/ships/AL/time",
             "https://int-api.serenade.sh.rccl.com/en/royal/mobile/v2/ships/AL/time",
            "https://int-api.serenade.sh.rccl.com/en/royal/mobile/v2/generics/countries",
            "https://int-api.serenade.sh.rccl.com/en/royal/mobile/v1/geo/portSequence",
            "https://int-api.serenade.sh.rccl.com/en/royal/mobile/v2/ports",
            "https://int-api.serenade.sh.rccl.com/en/royal/mobile/v2/ships/AL/deckMaps",
            "https://int-api.serenade.sh.rccl.com/en/royal/mobile/v2/agreement",
            "https://int-api.serenade.sh.rccl.com/en/royal/mobile/v2/ships",
            "https://int-api.serenade.sh.rccl.com/en/royal/mobile/v2/ships/AL/stats",
            "https://int-api.serenade.sh.rccl.com/en/royal/mobile/v3/ships/AL/stats",
            "https://int-api.serenade.sh.rccl.com/en/royal/mobile/v2/ships/AL/voyages",
            "https://int-api.serenade.sh.rccl.com/en/royal/mobile/v2/weather/ships/AL/sailDate/20180826",

            "https://int-api.symphony.sh.rccl.com/en/royal/mobile/v2/configurations",
            "https://int-api.symphony.sh.rccl.com/en/royal/mobile/v2/generics/countries",
            "https://int-api.symphony.sh.rccl.com/en/royal/mobile/v3/ships/AL/time",
            "https://int-api.symphony.sh.rccl.com/en/royal/mobile/v2/ships/AL/time",
            "https://int-api.symphony.sh.rccl.com/en/royal/mobile/v2/generics/countries",
            "https://int-api.symphony.sh.rccl.com/en/royal/mobile/v1/geo/portSequence",
            "https://int-api.symphony.sh.rccl.com/en/royal/mobile/v2/ports",
            "https://int-api.symphony.sh.rccl.com/en/royal/mobile/v2/ships/AL/deckMaps",
            "https://int-api.symphony.sh.rccl.com/en/royal/mobile/v2/agreement",
            "https://int-api.symphony.sh.rccl.com/en/royal/mobile/v2/ships",
            "https://int-api.symphony.sh.rccl.com/en/royal/mobile/v2/ships/AL/stats",
            "https://int-api.symphony.sh.rccl.com/en/royal/mobile/v3/ships/AL/stats",
            "https://int-api.symphony.sh.rccl.com/en/royal/mobile/v2/ships/AL/voyages",
            "https://int-api.symphony.sh.rccl.com/en/royal/mobile/v2/weather/ships/AL/sailDate/20180826"
    };

        for (int i = 0; i < hostList.length; i++) {

            String url = hostList[i];
            getStatus(url);

        }

        System.out.println("Task completed...");
    }

    public static String getStatus(String url) throws IOException {

        int count = 0 ;
        String result = "";
        int code = 200;
        int code400 = 400;

        try {
            URL siteURL = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(10000);
            connection.connect();

            code = connection.getResponseCode();
            if (code == 200) {
                result = "-> Green <-\t" + "Code: " + code;
                ;
            } else if (code == 400) {
                result = "-> Green <-\t" + "Code: " + code;
                ;
            }

            else {
                result = "-> Yellow <-\t" + "Code: " + code;
            }
        } catch (Exception e) {
            result = "-> Red <-\t" + "Wrong domain - Exception: " + e.getMessage();

        }
        System.out.println(count++  + "\t" + url + "\t\t\t\t\t\tStatus:" + result);
        return result;
    }

}