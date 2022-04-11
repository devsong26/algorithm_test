package programmers.module;

public abstract class SolutionChecker {

    private Object[] inputs;
    private Object[] results;

    //TODO 나중에 삭제돼야 함
    private Object[] solutions;

    public SolutionChecker(Object[] inputs, Object[] results){
        this.inputs = inputs;
        this.results = results;
    }

    abstract public <T, M> T solution(M m);

    public void check(){
        for(int i=0; i<results.length; i++){
            System.out.println(String.format("input >> %s", inputs[i].toString()));
            System.out.println(String.format("result >> %s", results[i].toString()));

            assert results[i].equals(solutions[i]);
        }
    }

    public void setSolutions(Object[] solutions){
        this.solutions = solutions;
    }

}
