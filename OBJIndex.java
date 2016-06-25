/**
 * Write a description of class OBJIndex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OBJIndex
{
    private int vertexIndex;
    private int texCoordIndex;
    private int normalIndex;

    @Override
    public boolean equals(Object obj)
    {
        OBJIndex index = (OBJIndex)obj;

        return vertexIndex == index.vertexIndex && texCoordIndex == index.texCoordIndex && normalIndex == index.normalIndex;
    }

    @Override
    public int hashCode()
    {
        final int BASE = 17;
        final int MULTIPLIER = 31;

        int result = BASE;

        result = MULTIPLIER * result + vertexIndex;
        result = MULTIPLIER * result + texCoordIndex;
        result = MULTIPLIER * result + normalIndex;

        return result;
    }
    
    public int getVertexIndex()
    {
        return vertexIndex;
    }
    
    public int getTexCoordIndex()
    {
        return texCoordIndex;
    }
    
    public int getNormalIndex()
    {
        return normalIndex;
    }

    public void setVertexIndex(int val)
    {
        vertexIndex = val;
    }
    
    public void setTexCoordIndex(int val)
    {
        texCoordIndex = val;
    }
    
    public void setNormalIndex(int val)
    {
        normalIndex = val;
    }
}