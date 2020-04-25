class Elephant {
  int heightInCM;
}

class Lion{
  int heightInCM;
}

class Fridge {

  int heightInCM;
  Elephant storage;
  Lion storage2;

  void store(Elephant elephant) {
    if(storage2 == null && storage == null){
      storage = elephant;
    }else{
      System.out.println("冰箱已经装满了");
    }
  }

  void store(Lion lion){
    if(storage == null && storage2 == null){
      storage2 = lion;
    }else{
      System.out.println("冰箱已经装满了");
    }
  }

  Elephant remove(){
    storage = null;
    return storage;
  }
}

class ObjectDemo {
  static Elephant createElephant(int heightInCM) {
    System.out.printf("创建一个大象，高度%d厘米\n", heightInCM);
    // 使用定义的类作为数据类型
    // 使用new 创建一个对象（实例）
    Elephant elephant = new Elephant();
    // 使用. 访问对象的属性，可以对属性赋值或使用
    elephant.heightInCM = heightInCM;
    return elephant;
  }

  static Lion createLion(int heightInCM){
    System.out.printf("创建一个狮子，高度%d厘米\n", heightInCM);
    Lion lion = new Lion();
    lion.heightInCM = heightInCM;
    return lion;
  }

  static Fridge createFridge(int heightInCM) {
    System.out.printf("创建一个冰箱，高度%d厘米\n", heightInCM);
    Fridge fridge = new Fridge();
    fridge.heightInCM = heightInCM;
    return fridge;
  }

  static void putInElephant(Elephant elephant, Fridge fridge) {
    System.out.printf("把%d厘米高的大象装进%d厘米高的冰箱\n", elephant.heightInCM, fridge.heightInCM);
    if(elephant.heightInCM < fridge.heightInCM) {

      // 使用对象方法
      fridge.store(elephant);
      System.out.printf("冰箱里面的大象高度是%d厘米\n", fridge.storage.heightInCM);
    } else {
      System.out.printf("冰箱装不下!\n");
    }
  }

  static void putInLion(Lion lion, Fridge fridge) {
    System.out.printf("把%d厘米高的狮子装进%d厘米高的冰箱\n", lion.heightInCM, fridge.heightInCM);
    if(lion.heightInCM < fridge.heightInCM) {

      // 使用对象方法
      fridge.store(lion);
      //System.out.printf("冰箱里面的狮子高度是%d厘米\n", fridge.storage2.heightInCM);
    } else {
      System.out.printf("冰箱装不下!\n");
    }
  }

  static void pushoutElephant(Fridge fridge){
    System.out.println("把大象从冰箱中推出");
    if(fridge.storage != null){
      fridge.storage = fridge.remove();
    }
    else{
      System.out.println("冰箱已经为空！");
    }
  }

  public static void main(String[] args) {
    Elephant elephant = createElephant(300);
    Fridge fridge = createFridge(500);
    Lion lion = createLion(200);
    putInElephant(elephant, fridge); 
    System.out.println(fridge.storage.heightInCM);
    putInLion(lion, fridge);
    pushoutElephant(fridge);
    System.out.println(fridge.storage.heightInCM);
  }
}