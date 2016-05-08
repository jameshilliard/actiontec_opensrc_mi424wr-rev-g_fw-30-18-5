package gnu.crypto.jce.sig;

// ----------------------------------------------------------------------------
// $Id: DSSRawSignatureSpi.java,v 1.2 2005/10/20 12:04:59 alexa Exp $
//
// Copyright (C) 2001, 2002, Free Software Foundation, Inc.
//
// This file is part of GNU Crypto.
//
// GNU Crypto is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2, or (at your option)
// any later version.
//
// GNU Crypto is distributed in the hope that it will be useful, but
// WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; see the file COPYING.  If not, write to the
//
//    Free Software Foundation Inc.,
//    51 Franklin Street, Fifth Floor,
//    Boston, MA 02110-1301
//    USA
//
// Linking this library statically or dynamically with other modules is
// making a combined work based on this library.  Thus, the terms and
// conditions of the GNU General Public License cover the whole
// combination.
//
// As a special exception, the copyright holders of this library give
// you permission to link this library with independent modules to
// produce an executable, regardless of the license terms of these
// independent modules, and to copy and distribute the resulting
// executable under terms of your choice, provided that you also meet,
// for each linked independent module, the terms and conditions of the
// license of that module.  An independent module is a module which is
// not derived from or based on this library.  If you modify this
// library, you may extend this exception to your version of the
// library, but you are not obligated to do so.  If you do not wish to
// do so, delete this exception statement from your version.
// ----------------------------------------------------------------------------

import gnu.crypto.Registry;
import gnu.crypto.sig.dss.DSSSignatureRawCodec;

/**
 * The implementation of <i>Service Provider Interface</i> (<b>SPI</b>) adapter
 * for the DSS (Digital Signature Standard) signature scheme, encoded and/or
 * decoded in RAW format.<p>
 *
 * @version $Revision: 1.2 $
 */
public class DSSRawSignatureSpi extends SignatureAdapter {

   // Constants and variables
   // -------------------------------------------------------------------------

   // Constructor(s)
   // -------------------------------------------------------------------------

   public DSSRawSignatureSpi() {
      super(Registry.DSS_SIG, new DSSSignatureRawCodec());
   }

   // Class methods
   // -------------------------------------------------------------------------

   // Instance methods
   // -------------------------------------------------------------------------
}
