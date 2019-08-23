package IteratorPattern;

//public class NameRepository implements Container {
//    public String names[] = { "Robert" , "John" ,"Julie" , "Lora" };
//
//    @Override
//    public Iterator getIterator()
//    {
//        return new NameIterator();
//    }
//
//    private class NameIterator implements Iterator{
//        int index;      //默认为0
//
//        @Override
//        public boolean hasNext()
//        {
//            if (index < names.length)
//                return true;
//            return false;
//        }
//
//        @Override
//        public Object next()
//        {
//            if (this.hasNext())
//                return names[index++];
//            return null;
//        }
//    }
//}




class StringArrayIterator implements Iterator{
    String[] args;
    int index = 0;
    public StringArrayIterator(String[] argsTemp){
        this.args  = argsTemp;
    }

    @Override
    public boolean hasNext(){
        if(index < args.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next(){
        if(index < args.length){
            return args[index++];
        }
        return null;
    }
}

public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
    @Override
    public Iterator getIterator() {
        return new StringArrayIterator(names);
    }
}

