/**
 * Copyright (C) 2011 Angelo Zerr <angelo.zerr@gmail.com> and Pascal Leclercq <pascal.leclercq@gmail.com>
 *
 * All rights reserved.
 *
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated  documentation files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute,  sublicense, and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package fr.opensagres.xdocreport.template.textstyling.wiki.mediawiki;

import org.wikimodel.wem.IWikiParser;
import org.wikimodel.wem.mediawiki.MediaWikiParser;

import fr.opensagres.xdocreport.template.textstyling.IDocumentHandler;
import fr.opensagres.xdocreport.template.textstyling.ITextStylingTransformer;
import fr.opensagres.xdocreport.template.textstyling.wiki.AbstractWikiTextStylingTransformer;

/**
 * MediaWiki text styling transformer to transform MediaWiki syntax to another
 * document kind (odt, docx, etc) syntax. The ODT, DOCX is represented with the
 * given {@link IDocumentHandler}.
 * 
 */
public class MediaWikiTextStylingTransformer extends
		AbstractWikiTextStylingTransformer {

	public static final ITextStylingTransformer INSTANCE = new MediaWikiTextStylingTransformer();

	@Override
	protected IWikiParser createWikiParser() {
		return new MediaWikiParser();
	}
}
