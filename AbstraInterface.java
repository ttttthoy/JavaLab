
    interface PersonalNumberStorage {
        void addPersonalInfo(String name, String perNum);
        String searchName(String perNum);
    }

    class PersonalNumInfo{
        String name;
        String number;

        PersonalNumInfo(String name, String number){
            this.name = name;
            this.number = number;
        }
        String getName(){
            return name;
        } 
        String getNumber(){
            return number;
        }
    }

    class PersonalNumberStorageImpl implements PersonalNumberStorage{
        PersonalNumInfo[] perArr;
        int numOfPerInfo;

        PersonalNumberStorageImpl(int sz){
            perArr = new PersonalNumInfo[sz];
            numOfPerInfo = 0;
        }

        public void addPersonalInfo(String name, String perNum){
            perArr[numOfPerInfo] = new PersonalNumInfo(name, perNum);
            numOfPerInfo++;
        }

        public String searchName(String perNum){
            for (int i = 0; i < numOfPerInfo; i++){
                if (perNum.compareTo(perArr[i].getNumber())==0)
                    return perArr[i].getName();
            }
            return null;
        }
    }

    class AbstraInterface{
        public static void main(String[] args){
            PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);
            storage.addPersonalInfo("이소윤", "920000-2199990");
            storage.addPersonalInfo("김나연", "940000-2355990");

            System.out.println(storage.searchName("920000-2199990"));
            System.out.println(storage.searchName("940000-2355990"));
        }
    }

