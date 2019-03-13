package ljug.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ljug.entities.Roles;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-24T22:24:01")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> userGsuite;
    public static volatile SingularAttribute<Users, String> userPass;
    public static volatile SingularAttribute<Users, String> description;
    public static volatile SingularAttribute<Users, String> userName;
    public static volatile SetAttribute<Users, Roles> rolesSet;

}