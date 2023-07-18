package LearningPackages.MappingInterface;

public interface Mappable {
    String JSoN_PROPERTY = """
             "properties": {%s}""";

    static void mapIt(Mappable mappable){

        System.out.println(JSoN_PROPERTY.formatted(mappable.toJSON()));
    };

    String getLabel();
    String getMarker();

    Geometry getShape();


    default String toJSON(){
        return """
                "type": "%s", "label": "%s", "marker": "%s""".formatted(getShape(), getLabel(), getMarker());
    };


}
