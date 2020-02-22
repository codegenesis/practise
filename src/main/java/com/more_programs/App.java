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

public class App {
    public static void main(String args[]) throws Exception {

        String[] hostList = {

                "http://shiptst1.mesos.rccl.com/discover-countries/v2/health",
                "http://shiptst1.mesos.rccl.com/discover-efc-shiptime/v1/health",
                "http://shiptst1.mesos.rccl.com/discover-generics/v2/health",
                "http://shiptst1.mesos.rccl.com/discover-port/v2/health",
                "http://shiptst1.mesos.rccl.com/discover-shipinfo/v2/health",
                "http://shiptst1.mesos.rccl.com/discover-shipinfo/v3/health",
                "http://shiptst1.mesos.rccl.com/discover-shiplist/v2/health",
                "http://shiptst1.mesos.rccl.com/discover-shipstats/v2/health",
                "http://shiptst1.mesos.rccl.com/discover-shipstats/v3/health",
                "http://shiptst1.mesos.rccl.com/discover-shipstats/v2/health",
                "http://shiptst1.mesos.rccl.com/discover-voyage/v2/health",
                "http://shiptst1.mesos.rccl.com/discover-voyage/v3/health",
                "http://shiptst1.mesos.rccl.com/discover-weatherinfo/v2/health",
                "http://shiptst1.mesos.rccl.com/discover-bookmark/v1/health",
                "http://shiptst1.mesos.rccl.com/discover-bookmark/v1/health",
                "http://shipstg1.mesos.rccl.com/discover-configmanagement/v2/health",
                "http://shipstg1.mesos.rccl.com/discover-countries/v2/health",
                "http://shipstg1.mesos.rccl.com/discover-generics/v2/health",
                "http://shipstg1.mesos.rccl.com/discover-port/v2/health",
                "http://shipstg1.mesos.rccl.com/discover-port/v2/health",
                "http://shipstg1.mesos.rccl.com/discover-shipinfo/v3/health",
                "http://shipstg1.mesos.rccl.com/discover-shiplist/v2/health",
                "http://shipstg1.mesos.rccl.com/discover-shipstats/v3/health",
                "http://shipstg1.mesos.rccl.com/discover-voyage/v2/health",
                "http://shipstg1.mesos.rccl.com/discover-voyage/v3/health",
                "http://shipstg1.mesos.rccl.com/discover-weatherinfo/v2/health",
                "http://mesos.adventure.sh.rccl.com/discover-configmanagement/v2/health",
                "http://mesos.adventure.sh.rccl.com/discover-countries/v2/health",
                "http://mesos.adventure.sh.rccl.com/discover-efc-shiptime/v1/health",
                "http://mesos.adventure.sh.rccl.com/discover-generics/v2/health",
                "http://mesos.adventure.sh.rccl.com/discover-port/v2/health",
                "http://mesos.adventure.sh.rccl.com/discover-port/v2/health",
                "http://mesos.adventure.sh.rccl.com/discover-shipinfo/v2/health",
                "http://mesos.adventure.sh.rccl.com/discover-shiplist/v2/health",
                "http://mesos.adventure.sh.rccl.com/discover-shipstats/v2/health",
                "http://mesos.adventure.sh.rccl.com/discover-shipstats/v3/health",
                "http://mesos.adventure.sh.rccl.com/discover-voyage/v2/health",
                "http://mesos.adventure.sh.rccl.com/discover-voyage/v3/health",
                "http://mesos.adventure.sh.rccl.com/discover-weatherinfo/v2/health",
                "http://mesos.allure.sh.rccl.com/discover-configmanagement/v2/health",
                "http://mesos.allure.sh.rccl.com/discover-countries/v2/health",
                "http://mesos.allure.sh.rccl.com/discover-efc-shiptime/v1/health",
                "http://mesos.allure.sh.rccl.com/discover-generics/v2/health",
                "http://mesos.allure.sh.rccl.com/discover-port/v2/health",
                "http://mesos.allure.sh.rccl.com/discover-port/v2/health",
                "http://mesos.allure.sh.rccl.com/discover-shipinfo/v2/health",
                "http://mesos.allure.sh.rccl.com/discover-shiplist/v2/health",
                "http://mesos.allure.sh.rccl.com/discover-shipstats/v2/health",
                "http://mesos.allure.sh.rccl.com/discover-shipstats/v3/health",
                "http://mesos.allure.sh.rccl.com/discover-voyage/v2/health",
                "http://mesos.allure.sh.rccl.com/discover-voyage/v3/health",
                "http://mesos.allure.sh.rccl.com/discover-weatherinfo/v2/health",
                "http://mesos.enchantment.sh.rccl.com/discover-configmanagement/v2/health",
                "http://mesos.enchantment.sh.rccl.com/discover-countries/v2/health",
                "http://mesos.enchantment.sh.rccl.com/discover-efc-shiptime/v1/health",
                "http://mesos.enchantment.sh.rccl.com/discover-generics/v2/health",
                "http://mesos.enchantment.sh.rccl.com/discover-port/v2/health",
                "http://mesos.enchantment.sh.rccl.com/discover-port/v2/health",
                "http://mesos.enchantment.sh.rccl.com/discover-shipinfo/v2/health",
                "http://mesos.enchantment.sh.rccl.com/discover-shiplist/v2/health",
                "http://mesos.enchantment.sh.rccl.com/discover-shipstats/v2/health",
                "http://mesos.enchantment.sh.rccl.com/discover-shipstats/v3/health",
                "http://mesos.enchantment.sh.rccl.com/discover-voyage/v2/health",
                "http://mesos.enchantment.sh.rccl.com/discover-voyage/v3/health",
                "http://mesos.enchantment.sh.rccl.com/discover-weatherinfo/v2/health",
                "http://mesos.independence.sh.rccl.com/discover-configmanagement/v2/health",
                "http://mesos.independence.sh.rccl.com/discover-countries/v2/health",
                "http://mesos.independence.sh.rccl.com/discover-efc-shiptime/v1/health",
                "http://mesos.independence.sh.rccl.com/discover-generics/v2/health",
                "http://mesos.independence.sh.rccl.com/discover-port/v2/health",
                "http://mesos.independence.sh.rccl.com/discover-port/v2/health",
                "http://mesos.independence.sh.rccl.com/discover-shipinfo/v2/health",
                "http://mesos.independence.sh.rccl.com/discover-shiplist/v2/health",
                "http://mesos.independence.sh.rccl.com/discover-shipstats/v2/health",
                "http://mesos.independence.sh.rccl.com/discover-shipstats/v3/health",
                "http://mesos.independence.sh.rccl.com/discover-voyage/v2/health",
                "http://mesos.independence.sh.rccl.com/discover-voyage/v3/health",
                "http://mesos.independence.sh.rccl.com/discover-weatherinfo/v2/health",
                "http://mesos.mariner.sh.rccl.com/discover-configmanagement/v2/health",
                "http://mesos.mariner.sh.rccl.com/discover-countries/v2/health",
                "http://mesos.mariner.sh.rccl.com/discover-efc-shiptime/v1/health",
                "http://mesos.mariner.sh.rccl.com/discover-generics/v2/health",
                "http://mesos.mariner.sh.rccl.com/discover-port/v2/health",
                "http://mesos.mariner.sh.rccl.com/discover-port/v2/health",
                "http://mesos.mariner.sh.rccl.com/discover-shipinfo/v2/health",
                "http://mesos.mariner.sh.rccl.com/discover-shiplist/v2/health",
                "http://mesos.mariner.sh.rccl.com/discover-shipstats/v2/health",
                "http://mesos.mariner.sh.rccl.com/discover-shipstats/v3/health",
                "http://mesos.mariner.sh.rccl.com/discover-voyage/v2/health",
                "http://mesos.mariner.sh.rccl.com/discover-voyage/v3/health",
                "http://mesos.mariner.sh.rccl.com/discover-weatherinfo/v2/health",
                "http://mesos.oasis.sh.rccl.com/discover-configmanagement/v2/health",
                "http://mesos.oasis.sh.rccl.com/discover-countries/v2/health",
                "http://mesos.oasis.sh.rccl.com/discover-efc-shiptime/v1/health",
                "http://mesos.oasis.sh.rccl.com/discover-generics/v2/health",
                "http://mesos.oasis.sh.rccl.com/discover-port/v2/health",
                "http://mesos.oasis.sh.rccl.com/discover-port/v2/health",
                "http://mesos.oasis.sh.rccl.com/discover-shipinfo/v2/health",
                "http://mesos.oasis.sh.rccl.com/discover-shiplist/v2/health",
                "http://mesos.oasis.sh.rccl.com/discover-shipstats/v2/health",
                "http://mesos.oasis.sh.rccl.com/discover-shipstats/v3/health",
                "http://mesos.oasis.sh.rccl.com/discover-voyage/v2/health",
                "http://mesos.oasis.sh.rccl.com/discover-voyage/v3/health",
                "http://mesos.oasis.sh.rccl.com/discover-weatherinfo/v2/health",
                "http://mesos.serenade.sh.rccl.com/discover-configmanagement/v2/health",
                "http://mesos.serenade.sh.rccl.com/discover-countries/v2/health",
                "http://mesos.serenade.sh.rccl.com/discover-efc-shiptime/v1/health",
                "http://mesos.serenade.sh.rccl.com/discover-generics/v2/health",
                "http://mesos.serenade.sh.rccl.com/discover-port/v2/health",
                "http://mesos.serenade.sh.rccl.com/discover-port/v2/health",
                "http://mesos.serenade.sh.rccl.com/discover-shipinfo/v2/health",
                "http://mesos.serenade.sh.rccl.com/discover-shiplist/v2/health",
                "http://mesos.serenade.sh.rccl.com/discover-shipstats/v2/health",
                "http://mesos.serenade.sh.rccl.com/discover-shipstats/v3/health",
                "http://mesos.serenade.sh.rccl.com/discover-voyage/v2/health",
                "http://mesos.serenade.sh.rccl.com/discover-voyage/v3/health",
                "http://mesos.serenade.sh.rccl.com/discover-weatherinfo/v2/health",
                "http://mesos.symphony.sh.rccl.com/discover-configmanagement/v2/health",
                "http://mesos.symphony.sh.rccl.com/discover-countries/v2/health",
                "http://mesos.symphony.sh.rccl.com/discover-efc-shiptime/v1/health",
                "http://mesos.symphony.sh.rccl.com/discover-generics/v2/health",
                "http://mesos.symphony.sh.rccl.com/discover-port/v2/health",
                "http://mesos.symphony.sh.rccl.com/discover-port/v2/health",
                "http://mesos.symphony.sh.rccl.com/discover-shipinfo/v2/health",
                "http://mesos.symphony.sh.rccl.com/discover-shiplist/v2/health",
                "http://mesos.symphony.sh.rccl.com/discover-shipstats/v2/health",
                "http://mesos.symphony.sh.rccl.com/discover-shipstats/v3/health",
                "http://mesos.symphony.sh.rccl.com/discover-voyage/v2/health",
                "http://mesos.symphony.sh.rccl.com/discover-voyage/v3/health",
                "http://mesos.symphony.sh.rccl.com/discover-weatherinfo/v2/health",
                "http://10.16.6.19:10163/solr/",
                "http://10.16.6.92:10272/solr/",
                "http://10.17.131.92:10238/solr/",
                "http://10.17.121.235:10122/solr/",
                "http://10.135.105.158:10153/solr/",
                "http://10.196.105.158:10116/solr/",
                "http://10.137.105.159:10309/solr/",
                "http://10.154.105.158:10115/solr/",
                "http://10.127.105.159:10134/solr/",
                "http://10.150.105.158:10118/solr/",
                "http://10.142.105.159:10101/solr/",
                "http://10.149.105.158:10119/solr/",
                "http://10.130.105.158:10105/solr/",
                "http://10.117.105.158:10118/solr/",
                "http://10.164.105.158:10102/solr/",
                "http://10.165.105.158:10125/solr/",
                "http://10.156.105.158:10105/solr/",
                // "http://10.166.105.158:10130/solr/",
                "http://10.126.105.158:10107/solr/",
                "http://10.132.105.158:10169/solr/",
                "http://10.107.105.158:10112/solr/",
                "http://10.157.105.158:10187/solr/",
                "http://10.147.105.159:10187/solr/",
                "http://shiptst1.mesos.rccl.com/category/v2/en/royal/mobile/v2/categories/health",
                "http://shiptst1.mesos.rccl.com/menus/v2/en/royal/mobile/v2/menus/health",
                "http://shiptst1.mesos.rccl.com/search/v2/en/royal/mobile/v2/search/health",
                "http://shiptst1.mesos.rccl.com/venue/v2/en/royal/mobile/v2/venues/health",
                "http://shipstg1.mesos.rccl.com/category/v2/en/royal/mobile/v2/categories/health",
                "http://shipstg1.mesos.rccl.com/menus/v2/en/royal/mobile/v2/menus/health",
                "http://shipstg1.mesos.rccl.com/search/v2/en/royal/mobile/v2/search/health",
                "http://shipstg1.mesos.rccl.com/venue/v3/en/royal/mobile/v2/venues/health",
                "http://mesos.allure.sh.rccl.com/category/v2/en/royal/mobile/v2/categories/health",
                "http://mesos.allure.sh.rccl.com/menus/v2/en/royal/mobile/v2/menus/health",
                "http://mesos.allure.sh.rccl.com/search/v2/en/royal/mobile/v2/search/health",
                "http://mesos.allure.sh.rccl.com/venue/v2/en/royal/mobile/v2/venues/health",
                "http://mesos.adventure.sh.rccl.com/category/v2/en/royal/mobile/v2/categories/health",
                "http://mesos.adventure.sh.rccl.com/menus/v2/en/royal/mobile/v2/menus/health",
                "http://mesos.adventure.sh.rccl.com/search/v2/en/royal/mobile/v2/search/health",
                "http://mesos.adventure.sh.rccl.com/venue/v2/en/royal/mobile/v2/venues/health",
                "http://mesos.enchantment.sh.rccl.com/category/v2/en/royal/mobile/v2/categories/health",
                "http://mesos.enchantment.sh.rccl.com/menus/v2/en/royal/mobile/v2/menus/health",
                "http://mesos.enchantment.sh.rccl.com/search/v2/en/royal/mobile/v2/search/health",
                "http://mesos.enchantment.sh.rccl.com/venue/v2/en/royal/mobile/v2/venues/health",
                "http://mesos.independence.sh.rccl.com/category/v2/en/royal/mobile/v2/categories/health",
                "http://mesos.independence.sh.rccl.com/menus/v2/en/royal/mobile/v2/menus/health",
                "http://mesos.independence.sh.rccl.com/search/v2/en/royal/mobile/v2/search/health",
                "http://mesos.independence.sh.rccl.com/venue/v2/en/royal/mobile/v2/venues/health",
                "http://mesos.mariner.sh.rccl.com/category/v2/en/royal/mobile/v2/categories/health",
                "http://mesos.mariner.sh.rccl.com/menus/v2/en/royal/mobile/v2/menus/health",
                "http://mesos.mariner.sh.rccl.com/search/v2/en/royal/mobile/v2/search/health",
                "http://mesos.mariner.sh.rccl.com/venue/v2/en/royal/mobile/v2/venues/health",
                "http://mesos.oasis.sh.rccl.com/category/v2/en/royal/mobile/v2/categories/health",
                "http://mesos.oasis.sh.rccl.com/menus/v2/en/royal/mobile/v2/menus/health",
                "http://mesos.oasis.sh.rccl.com/search/v2/en/royal/mobile/v2/search/health",
                "http://mesos.oasis.sh.rccl.com/venue/v2/en/royal/mobile/v2/venues/health",
                "http://mesos.serenade.sh.rccl.com/category/v2/en/royal/mobile/v2/categories/health",
                "http://mesos.serenade.sh.rccl.com/menus/v2/en/royal/mobile/v2/menus/health",
                "http://mesos.serenade.sh.rccl.com/search/v2/en/royal/mobile/v2/search/health",
                "http://mesos.serenade.sh.rccl.com/venue/v2/en/royal/mobile/v2/ven  ues/health",
                "http://mesos.symphony.sh.rccl.com/category/v2/en/royal/mobile/v2/categories/health",
                "http://mesos.symphony.sh.rccl.com/menus/v2/en/royal/mobile/v2/menus/health",
                "http://mesos.symphony.sh.rccl.com/search/v2/en/royal/mobile/v2/search/health",
                "http://mesos.symphony.sh.rccl.com/venue/v2/en/royal/mobile/v2/venues/health"


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
            } else {
                result = "-> Yellow <-\t" + "Code: " + code;
            }
        } catch (Exception e) {
            result = "-> Red <-\t" + "Wrong domain - Exception: " + e.getMessage();

        }
        System.out.println(count++  + "\t" + url + "\t\t\t\t\t\tStatus:" + result);
        return result;
    }

}