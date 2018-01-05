package commandpattern;

/*
 To achieve desierd functionality , we need to first 
create a base abstract class : Command. This class will serve
as a link between the inherited command class and will conatain refrenences to the
method on the Document object

*/

/**
 *
 * @author Sohail
 */
abstract class Command {
    
    abstract public void Redo();
    abstract public void Undo();
}
