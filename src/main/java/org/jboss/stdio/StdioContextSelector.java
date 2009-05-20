/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.stdio;

/**
 * A mechanism for determining what the current standard I/O context is.  All I/O to {@link System#in}, {@link System#out},
 * and {@link System#err} are handled by the current standard I/O context which is returned by the active instance
 * of this interface.
 *
 * @see org.jboss.stdio.StdioContext#setStdioContextSelector(StdioContextSelector)
 */
public interface StdioContextSelector {

    /**
     * Get the current stdio context.  Must not return {@code null}.
     *
     * @return the current stdio context
     */
    StdioContext getStdioContext();
}
