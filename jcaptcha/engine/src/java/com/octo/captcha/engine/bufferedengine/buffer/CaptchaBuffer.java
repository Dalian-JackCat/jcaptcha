/*
 * Created on 11 mai 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.octo.captcha.engine.bufferedengine.buffer;

import java.util.Collection;
import java.util.Locale;

import org.apache.commons.collections.BufferUnderflowException;

import com.octo.captcha.Captcha;

/**
 * CaptchaBuffer is the interface to describe buffers of captchas.
 * 
 * @author Benoit Doumas
 */
public interface CaptchaBuffer
{
    /**
     * remove a captcha from the buffer
     * 
     * @return a captcha
     * @throws BufferUnderflowException
     *                  if there is no captcha throw BufferUnderflowException
     */
    public Captcha removeCaptcha() throws BufferUnderflowException;

    /**
     * remove a captcha from the buffer corresponding to the locale
     * 
     * @param locale
     *                  The locale the catcha to remove
     * @return a captcha correponding to the locale
     * @throws BufferUnderflowException
     *                  if there is no captcha throw BufferUnderflowException
     */
    public Captcha removeCaptcha(Locale locale) throws BufferUnderflowException;

    /**
     * Remove a precise number of captcha
     * 
     * @param number
     *                  The number of captchas to remove
     * @return a collection of captchas
     */
    public Collection removeCaptcha(int number);

    /**
     * Remove a precise number of captcha with a locale
     * 
     * @param number
     *                  The number of captchas to remove
     * @param locale
     *                  The locale of the removed captchas
     * @return a collection of captchas
     */
    public Collection removeCaptcha(int number, Locale locale);

    /**
     * Put a captcha with default laocale
     * 
     * @param captcha
     */
    public void putCaptcha(Captcha captcha);

    /**
     * Put a captcha with a locale
     * 
     * @param captcha
     *                  The captcha to add
     * @param locale
     *                  the locale of the captcha
     */
    public void putCaptcha(Captcha captcha, Locale locale);

    /**
     * Put a collection of captchas with the default locale
     * 
     * @param captchas
     *                  The captchas to add
     */
    public void putAllCaptcha(Collection captchas);

    /**
     * Put a collection of captchas with his locale
     * 
     * @param captchas
     *                  The captchas to add
     * @param locale
     *                  The locale of the captchas
     */
    public void putAllCaptcha(Collection captchas, Locale locale);

    /**
     * Get the size of the buffer for all locales
     * 
     * @return The size of the buffer
     */
    public int size();

    /**
     * Get the size of the buffer for a locale
     * 
     * @param locale
     *                  the locale to get the size
     * @return The size of the buffer
     */
    public int size(Locale locale);

    /**
     * Release all the ressources and close the buffer.
     */
    public void dispose();
    
    /**
     * Clear the buffer from all locale
     */
    public void clear();
    
    /**
     * Get all the locales used
     */
    public Collection getLocales();
}
