/* CVS $Id: $ */
package org.dbpedia.events.vocabs; 
import com.hp.hpl.jena.rdf.model.*;
 
/**
 * Vocabulary definitions from ./src/main/resources/events.ttl 
 * @author Auto-generated by schemagen on 13 Mai 2015 17:28 
 */
public class EventsOntology {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://events.dbpedia.org/ns/core#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "0.2";
    
    public static final Property context = m_model.createProperty( "http://events.dbpedia.org/ns/core#context" );
    
    public static final Property contextQueryString = m_model.createProperty( "http://events.dbpedia.org/ns/core#contextQueryString" );
    
    public static final Property daysSinceLastWikipageModified = m_model.createProperty( "http://events.dbpedia.org/ns/core#daysSinceLastWikipageModified" );
    
    public static final Property descriptionTemplate = m_model.createProperty( "http://events.dbpedia.org/ns/core#descriptionTemplate" );
    
    public static final Property digest = m_model.createProperty( "http://events.dbpedia.org/ns/core#digest" );
    
    public static final Property ignore = m_model.createProperty( "http://events.dbpedia.org/ns/core#ignore" );
    
    public static final Property numberOfChangesetFiles = m_model.createProperty( "http://events.dbpedia.org/ns/core#numberOfChangesetFiles" );
    
    public static final Property queryString = m_model.createProperty( "http://events.dbpedia.org/ns/core#queryString" );
    
    public static final Property rankValue = m_model.createProperty( "http://events.dbpedia.org/ns/core#rankValue" );
    
    public static final Property rankWeight = m_model.createProperty( "http://events.dbpedia.org/ns/core#rankWeight" );
    
    public static final Property resourceIndegree = m_model.createProperty( "http://events.dbpedia.org/ns/core#resourceIndegree" );
    
    public static final Property resourceOutdegree = m_model.createProperty( "http://events.dbpedia.org/ns/core#resourceOutdegree" );
    
    public static final Property update = m_model.createProperty( "http://events.dbpedia.org/ns/core#update" );
    
    public static final Resource Digest = m_model.createResource( "http://events.dbpedia.org/ns/core#Digest" );
    
    public static final Resource DigestTemplate = m_model.createResource( "http://events.dbpedia.org/ns/core#DigestTemplate" );
    
    public static final Resource Event = m_model.createResource( "http://events.dbpedia.org/ns/core#Event" );
    
}
