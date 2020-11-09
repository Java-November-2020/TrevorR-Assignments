public class ProjectTest {

    public static void main(String[] args) {
        Project fields = new Project();
        Project fieldName = new Project("name");
        Project fieldND= new Project("name", "description");
        fields.setName("name");
        fields.setDescription("description");
        System.out.println(fields.getName());
        System.out.println(fields.getDescription());
        System.out.println(fields.elevatorPitch());
        System.out.println(fieldName.getName());
        System.out.println(fieldND.getName());
        System.out.println(fieldND.getDescription());
        System.out.println(fieldND.elevatorPitch());


    }
}
