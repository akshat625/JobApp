
package com.akshat.jobapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


//The @Data annotation is a Lombok annotation that automatically generates getters, setters, equals, hashcode, and toString methods in the Java code. It is a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, @Getter / @Setter, and @RequiredArgsConstructor together.
//The @NoArgsConstructor annotation is a Lombok annotation to create a no-argument constructor.
// The @AllArgsConstructor annotation is a Lombok annotation to create a constructor with all the fields in the class as arguments.

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

}
