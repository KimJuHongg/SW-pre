//1.배에는 3개의 의자가 있고 다리가 아픈 동물들이 순서대로 들어옴
//2. 동물의 종류 : 무척추동물, 척추동물, 어류, 양서류, 파충류, 조류, 포유류
//3. 동물들의 종이 같을 경우 무릎에 앉을 수 있다. 다 회복된 동물들은 언제들지 빠질 수 있음 무릎에 앉을 경우 1초로 카운트
//4. 아무도 없거나 자리가 꽉차있을때 이 종이 들어올 경우 가장 오래 앉아있던 동물이 아닌 가장 최근에 같은 종이 한번도 들어오지 않은 종이 나가게 된다.
//이때 자리를 청소하는데 1분이 걸림
// 동물들이 아래와 같이 차례대로 들어왔을 때 전체 수행 시간(실행 시간)을 구해야한다.
//여기서는 LRU알고리즘 사용, LRU알고리즘은 자리부재가 발생했을 경우 가장 오랫동안 사용되지 않은 자리를 제거하는 알고리즘
//  가장 최근에 들어오지 않은 친구를 생각하는 게 포인트!, ArrayList 사용

package day0725;

import java.util.ArrayList;
import java.util.List;

import day0724.Person;

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        // 동물들의 종류
        String[] animalTypes = {"무척추동물", "척추동물", "어류", "양서류", "파충류", "조류", "포유류"};

        // 입력으로 주어진 동물들의 종류 순서 (예시)
        String[] inputAnimals = {"포유류", "조류", "파충류", "양서류", "어류", "무척추동물", "포유류", "조류"};

        int chairCount = 3;
        int kneeCleanTime = 60; // 자리 청소 시간 (1분 = 60초)
        int kneeSitTime = 1;    // 무릎에 앉는 시간 (1초)

        int totalTime = calculateTotalTime(chairCount, kneeCleanTime, kneeSitTime, animalTypes, inputAnimals);
        System.out.println("전체 수행 시간: " + totalTime + "초");
    }

    public static int calculateTotalTime(int chairCount, int kneeCleanTime, int kneeSitTime, String[] animalTypes, String[] inputAnimals) {
        ArrayList<String> chairList = new ArrayList<>(); // 의자에 앉은 동물들을 저장할 리스트
        HashMap<String, Integer> animalMap = new HashMap<>(); // 동물의 종류와 마지막으로 앉은 시간을 저장할 맵

        int totalTime = 0;
        for (String animal : inputAnimals) {
            // 동물의 종류가 이미 의자에 있는 경우, 해당 동물을 가장 최근에 앉은 것으로 갱신
            if (chairList.contains(animal)) {
                animalMap.put(animal, totalTime);
            } else {
                // 자리가 비어있는 경우
                if (chairList.size() < chairCount) {
                    chairList.add(animal);
                    animalMap.put(animal, totalTime);
                } else {
                    // 자리가 꽉 찬 경우, LRU 알고리즘을 사용하여 가장 오랫동안 사용되지 않은 동물을 제거
                    String leastRecentAnimal = findLeastRecentAnimal(animalMap);
                    chairList.remove(leastRecentAnimal);
                    chairList.add(animal);
                    animalMap.put(animal, totalTime);
                }
            }
            totalTime += kneeSitTime; // 동물이 의자에 앉는 시간 추가
        }

        // 동물이 끝까지 들어왔지만 아직 의자에서 일부 동물이 빠지지 않은 경우 처리
        while (!chairList.isEmpty()) {
            int cleanTime = chairList.size() * kneeCleanTime;
            totalTime += cleanTime;
            chairList.clear();
        }

        return totalTime;
    }

    private static String findLeastRecentAnimal(HashMap<String, Integer> animalMap) {
        String leastRecentAnimal = null;
        int minTime = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : animalMap.entrySet()) {
            if (entry.getValue() < minTime) {
                minTime = entry.getValue();
                leastRecentAnimal = entry.getKey();
            }
        }

        return leastRecentAnimal;
    }
}
