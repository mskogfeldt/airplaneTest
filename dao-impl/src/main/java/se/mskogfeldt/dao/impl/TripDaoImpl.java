package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.AirplaneDao;
import se.mskogfeldt.dao.TripDao;
import se.mskogfeldt.entity.*;

import java.util.*;

public class TripDaoImpl implements TripDao {

    // private final TripDao tripDao;
    Map<String, TripEntity> comingTrips = new HashMap<>();

    Map<String, TripEntity> doneTrips = new HashMap<>();

    Map<String, String> destinationForTrip = new HashMap<>();

    Map<String, AirplaneEntity> planeUsedForCertainTrip;



}

/*
  Map<String, Map<String, List<EconomyClassSeatEntity>>> bookedEconomySeats = new HashMap<>();

    Map<String, List<EconomyClassSeatEntity>> freeEconomySeats = new HashMap<>();

    Map<String, Map<String, List<BusinessClassSeatEntity>>> bookedBusinessSeats = new HashMap<>();

    Map<String, List<EconomyClassSeatEntity>> freeBusinessSeats = new HashMap<>();

    Map<String, Integer> costForBusinessClassSeat;

import java.util.*;
import java.util.stream.Collectors;public class TestingTesting {    public static void main(String[] args) {
       TestingTesting demo = new TestingTesting();
       List<String> list = new ArrayList<>();
       Map<Integer, List<String>> data = new HashMap<>();
       for (int i = 1; i < 10; i++) {
           list.add("name" + i);
           data.put(i, list);
       }        Map<Integer, List<String>> data2 = new HashMap<>();
       for (int i = 1; i < 10; i++) {
           list.add("name" + i);
           data.put(i, list);
       }
     /* System.out.println(list);
      System.out.println("Data: " + data);
      System.out.println("DataEntrySet: "+ data.entrySet());
      System.out.println("Data.values: " + data.values());*/
//System.out.println(demo.returnSmallList(data));
// System.out.println(demo.returnSmallList2(data, 11));
/*Map<String, Map<Integer, List<String>>> theSuperMap2 = new HashMap<>();
       theSuperMap2.put("1", data);
               theSuperMap2.put("2", data2);
               List<String> matslist = Arrays.asList("mats", "biniam");
        demo.delitingValues(data, 4, matslist);    }    public List returnSmallList(Map<Integer, List<String>> data) {
        return data.values().stream().collect(Collectors.toList());
        }    public List returnSmallList2(Map<Integer, List<String>> data, Integer i) {
        if (data.containsKey(i))
        return data.get(i).stream().collect(Collectors.toList());
        return null;
        }    public void delitingValues(Map<Integer, List<String>> data, Integer i, List<String> values) {
        System.out.println("the value of" + data.get(i) + "is deleted");
        data.remove(i);
        data.put(i, values);
        System.out.println("the new map value" + data.get(i));
        }    public List returnSmallListb(Map<String, Map <Integer, List<String>>> data) {
        return data.values().stream().collect(Collectors.toList());
        }    public Map returnSmallList2b(Map<String, Map <Integer, List<String>>> headMap, String index)  {
        if (headMap.containsKey(index))
        return headMap.get(index).stream().collect(Collectors.toMap());
        return null;
        }    public void delitingValues2(Map<Integer, List<String>> data, Integer i, List<String> values) {
        System.out.println("the value of" + data.get(i) + "is deleted");
        data.remove(i);
        data.put(i, values);
        System.out.println("the new map value" + data.get(i));
        }}
        */

/*
    public class MapDemo {
       public static void main(String[] args) {
           MapDemo demo=new MapDemo();
           List<String> list = new ArrayList<>();        Map<Integer, List<String>> data = new HashMap<>();
           for (int i = 1; i < 10; i++) {
               list.add("name" + i);
               data.put(i,list);
           }
           System.out.println(list);
           System.out.println("Data: " + data);
           System.out.println("DataEntrySet: "+ data.entrySet());
           System.out.println("Data.values: " + data.values());*/
//System.out.println(demo.returnSmallList(data));
// System.out.println(demo.returnSmallList2(data, 11));
    /*List<String> matslist = Arrays.asList("mats", "biniam");
       demo.delitingValues(data,4,matslist);
               }public List returnSmallList(Map<Integer, List<String>>data){return data.values().stream().collect(Collectors.toList());}
public List returnSmallList2(Map<Integer, List<String>>data,Integer i){
        if(data.containsKey(i))
        return data.get(i).stream().collect(Collectors.toList());
        return null;
        }public void delitingValues(Map<Integer, List<String>>data,Integer i,List<String> values){
        System.out.println("the value of"+data.get(i)+"is deleted");
        data.remove(i);
        data.put(i,values);
        System.out.println("the new map value"+data.get(i));}
        }

        */

